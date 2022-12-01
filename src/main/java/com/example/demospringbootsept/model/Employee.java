package com.example.demospringbootsept.model;

public class Employee {

    // properties

    String name;
    String dept;
    int age;

    // parameterized constructor

    public Employee(String name, String dept, int age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    // getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
