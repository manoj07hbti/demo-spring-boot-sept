package com.example.demospringbootsept.model;

public class Student {
    String name;
    int rollNo;
    String branch;
    String college;

    // todo parameterized constructor

    public Student(String name, int rollNo, String branch, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.college = college;
    }

    public Student() {
    }
    //todo getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
