package com.example.demospringbootsept.model;

public class Doctor {

    int age;
    String name;
    String dept;
    int number;

    public Doctor(int age, String name, String dept, int number) {

        this.age = age;
        this.name = name;
        this.dept = dept;
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
