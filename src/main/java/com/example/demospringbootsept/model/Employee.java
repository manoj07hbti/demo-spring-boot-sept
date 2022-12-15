package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_java_sept_batch")
public class Employee {

    @Id
    @GeneratedValue
    int code;
    @Column(name="Employee_Name")
    String name;
    String department;

    public Employee() {
    }

    public Employee(String name, String department, int code) {
        this.name = name;
        this.department = department;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
