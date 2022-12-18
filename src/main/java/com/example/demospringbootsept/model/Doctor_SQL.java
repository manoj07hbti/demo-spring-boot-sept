package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Doctor_Java")
public class Doctor_SQL {
    @Id
    @GeneratedValue
    long id;
    @Column(name = "Doctor")
    String name;
    String post;
    String dpt;

    //todo parameterized constructor

    public Doctor_SQL() {
    }

    public Doctor_SQL(long id, String name, String post, String dpt) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.dpt = dpt;
    }
    // todo getter and setter

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }
}
