package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name = "Engineer_Java")
public class Engineer_SQL {
    @Id
    @GeneratedValue
    long id;
    String name;
    String post;
    String Salary;
    String posting;

    //todo parameterized constructor

    public Engineer_SQL(long id, String name, String post, String salary, String posting) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.Salary = salary;
        this.posting = posting;
    }
    //todo default constructor
    public Engineer_SQL() {
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getPosting() {
        return posting;
    }

    public void setPosting(String posting) {
        this.posting = posting;
    }
}
