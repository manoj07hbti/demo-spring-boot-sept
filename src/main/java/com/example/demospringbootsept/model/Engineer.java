package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Engineer {


    String name;
    @Id
    @GeneratedValue
    int id;
    String branch;
    String place;

    public Engineer() {
    }

    public Engineer(String name, int id, String branch, String place) {
        this.name = name;
        this.id = id;
        this.branch = branch;
        this.place = place;
    }

    //todo getter and setter


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
