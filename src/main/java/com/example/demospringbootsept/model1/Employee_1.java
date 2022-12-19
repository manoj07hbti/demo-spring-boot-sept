package com.example.demospringbootsept.model1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_Data")
public class Employee_1 {
    @Id
    @GeneratedValue
    int id;
    String name;

    int salary;
    String company;

    public Employee_1() {
    }

    public Employee_1(String name, int id, int salary, String company) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
