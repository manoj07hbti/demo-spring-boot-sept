package com.example.demospringbootsept.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor_list {
    @Id
    @GeneratedValue
    int rollNo;
     String name;
    String specialist;

    public Doctor_list() {
    }

    public Doctor_list(String name, int age, String specialist) {
        this.name = name;
        this.rollNo = rollNo;
        this.specialist = specialist;
    }


    //setter&getter

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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
