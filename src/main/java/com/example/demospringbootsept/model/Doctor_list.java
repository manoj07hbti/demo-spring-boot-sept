package com.example.demospringbootsept.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor_list {
    @Id
    @GeneratedValue
    String name;
    int age ;
    String specialist;

    public Doctor_list() {
    }

    public Doctor_list(String name, int age, String specialist) {
        this.name = name;
        this.age = age;
        this.specialist = specialist;
    }


    //setter&getter

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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
