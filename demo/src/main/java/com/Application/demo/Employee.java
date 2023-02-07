package com.Application.demo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String jobTitle;
    private String imageUrl;
    @Column(nullable = false, updatable= false)
    private String employeeCode;

    public Employee() {
    }

    public Employee(String name, String email, String phone, String jobTitle, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.jobTitle=jobTitle;
        this.imageUrl = imageUrl;
        this.employeeCode=employeeCode;

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", email=" + email + '\'' +
                ", jobTitle" + jobTitle + '\'' +
                ", phone=" + phone + '\'' +
                ", imageUrl" + imageUrl + '\'' + "}";
    }
}
