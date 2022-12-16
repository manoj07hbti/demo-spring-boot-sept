package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Studentinfo_Java")

public class Student {


    @Id
    @GeneratedValue
    long rollNo;
    String name;
    int age;
    String section;

    // parameterized constructor


    public Student() {
    }

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

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
