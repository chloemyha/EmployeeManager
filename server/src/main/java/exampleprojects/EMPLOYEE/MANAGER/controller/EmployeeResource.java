package exampleprojects.EMPLOYEE.MANAGER.controller;

import exampleprojects.EMPLOYEE.MANAGER.model.Employee;
import exampleprojects.EMPLOYEE.MANAGER.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@RestController
@RequestMapping("/employee") //baseURL
public class EmployeeResource {
    //inject service

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity <List<Employee>> getAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping ("/find/{id}")
    public ResponseEntity <Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity <Employee> addEmployee(@RequestBody Employee employee){
        try{Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);}
        catch (Exception e ) {
            System.out.println('\n');
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update")
    public ResponseEntity <Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <?> deleteEmployee(@PathVariable ("id") Long id){
       try {
           employeeService.deleteEmployee(id);
           return new ResponseEntity<>(HttpStatus.OK);
       } catch (Exception e ) {
           System.out.println('\n');
           System.out.println(e);
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }


}
