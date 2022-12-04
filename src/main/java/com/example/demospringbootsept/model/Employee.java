package com.example.demospringbootsept.model;

public class Employee {

    String name;
    String department;
    int code;

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
