package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Student_september_batch")
public class Student {


    @Id
    @GeneratedValue
    long rollNo;

    @Column(name = "student_name")
    String name;
    int age;

    String section;

    //default constructor
    public Student(){

    }

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
