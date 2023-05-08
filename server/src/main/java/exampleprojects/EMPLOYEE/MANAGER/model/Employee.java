package exampleprojects.EMPLOYEE.MANAGER.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity // This tells Hibernate to make a table out of this class
public class Employee implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String dateOfBirth;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;


    public Employee(){}

    public Employee(Long id, String name, String email, String jobTitle, String phone, String employeeCode, String dateOfBirth, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.employeeCode = employeeCode;
        this.dateOfBirth = dateOfBirth;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}

