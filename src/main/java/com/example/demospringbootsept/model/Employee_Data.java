package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="EMP_DATA")
public class Employee_Data {
    @Id
    long id;

    @Column(name="employee_data")
    String name;
    int salary;
    String dept;

    public Employee_Data(long id, String name, int salary, String dept) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public long getId() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

