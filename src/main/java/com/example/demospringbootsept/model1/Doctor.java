package com.example.demospringbootsept.model1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Patient_Detail")
public class Doctor {
    @Id
            @GeneratedValue
    int id;
    @Column(name="Patient_name")
    String name;
   // int id;

    String blood_group;
    int age;

    public Doctor() {
    }

    public Doctor(String name, int id, String blood_group, int age) {
        this.name = name;
        this.id = id;
        this.blood_group = blood_group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
