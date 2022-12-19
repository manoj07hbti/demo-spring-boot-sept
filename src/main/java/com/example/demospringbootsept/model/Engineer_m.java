package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Engineer")
public class Engineer_m {
    @Id
    @GeneratedValue
    int id;
    String name,dpt;
    double salary;

    public Engineer_m() {
    }

    public Engineer_m(int id, String name, String dpt, double salary) {
        this.id = id;
        this.name = name;
        this.dpt = dpt;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
