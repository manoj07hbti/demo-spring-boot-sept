package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE")
public class Employee_SQL {
    @Id
    @GeneratedValue
    long id;
    @Column(name = "employee_name")
    String name;
    String dpt;
    String post;

    //todo parameterized constructor

    public Employee_SQL(long id, String name, String dpt, String post) {
        this.id = id;
        this.name = name;
        this.dpt = dpt;
        this.post = post;
    }
    // todo default constructor
    public Employee_SQL() {
    }

    //todo getter and setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
