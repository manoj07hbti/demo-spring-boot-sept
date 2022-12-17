package com.example.demospringbootsept.model1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STUDENT_SEPT_JAVa")
public class Student1 {
    @Id
    @GeneratedValue
    long rollNo;
    @Column(name="Student_name")

    String name;

    int age;

    String section;

    public Student1() {
    }

    public Student1(String name, int rollNo, int age, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
