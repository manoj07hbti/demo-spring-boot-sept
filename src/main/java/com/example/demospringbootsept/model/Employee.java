package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Employee_Edusol_Tundla")
public class Employee {

    @Id
    @GeneratedValue
    long roll;
    String name;
    String city;


    public Employee(String name, String city, long roll) {
        this.name = name;
        this.city = city;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }
}
