package exampleprojects.EMPLOYEE.MANAGER.repo;

import exampleprojects.EMPLOYEE.MANAGER.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//You need to create the repository that holds user records, as the following listing
// This will be AUTO IMPLEMENTED by Spring into a Bean called EmployeeRepo

public interface EmployeeRepo extends JpaRepository <Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);
}
