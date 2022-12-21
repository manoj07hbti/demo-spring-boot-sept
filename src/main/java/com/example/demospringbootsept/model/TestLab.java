package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestLab {
    @Id
    @GeneratedValue
    long id;
    String name;
    int report;
    String city;

    public TestLab() {
    }

    public TestLab(long id, String name, int report, String city) {
        this.id = id;
        this.name = name;
        this.report = report;
        this.city = city;
    }

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

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
