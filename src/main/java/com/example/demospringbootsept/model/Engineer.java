package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Engineer_list")
public class Engineer {

    @Id
    @GeneratedValue
    int age;
    String name;
    @Column(name = "Engineer_branch")
    String branch;
    String place;

    public Engineer() {
    }

    public Engineer(String name, int age, String branch, String place) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.place = place;
    }

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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
