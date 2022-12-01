package com.example.demospringbootsept.model;

public class Employee {
    String name;
    int age;
    String post;
    int salary;

    //todo parametrized constructor

    public Employee(String name, int age, String post, int salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    // todo Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
