package com.example.demospringbootsept.model;

public class Employee {

    String name;
    int salary;
    int id;
    String company;

    public Employee(String name, int salary, int id, String company) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.company = company;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany() {
        this.company = company;
    }
}
