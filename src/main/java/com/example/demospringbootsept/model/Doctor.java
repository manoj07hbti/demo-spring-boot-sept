package com.example.demospringbootsept.model;

public class Doctor {
    String name;
    int age;
    String specialist;

    public Doctor(String name, int age, String specialist) {

        this.name = name;
        this.age = age;
        this.specialist = specialist;
    }

    // getter and Setter

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

