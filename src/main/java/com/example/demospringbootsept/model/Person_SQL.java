package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Person_Java")
public class Person_SQL {
    @Id
    @GeneratedValue
    long rollNo;
    String name;
    String place;
    String job;

    //todo parameterized constructor

    public Person_SQL(long rollNo, String name, String place, String job) {
        this.rollNo = rollNo;
        this.name = name;
        this.place = place;
        this.job = job;
    }
    //todo default constructor
    public Person_SQL() {
    }

    //todo getter and setter

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
