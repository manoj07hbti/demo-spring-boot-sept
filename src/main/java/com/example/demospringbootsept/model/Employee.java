package com.example.demospringbootsept.model;

public class Employee {
    String name;
    String department;
    int id;
    Double Salary;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Employee(String name, String department, int id, Double salary) {
        this.name = name;
        this.department = department;
        this.id = id;
        Salary = salary;
    }
}
