package com.example.demospringbootsept.model;

public class Student {
    String name;
    int roll_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public Student(String name, int roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }
}
