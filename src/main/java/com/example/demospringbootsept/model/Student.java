package com.example.demospringbootsept.model;

public class Student {

    String name;
    int age;
    int rollNo;
    String section;

    // parameterized constructor


    public Student(String name, int age, int rollNo, String section) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.section = section;
    }

    // getter and setter


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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
