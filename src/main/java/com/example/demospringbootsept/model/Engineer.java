package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EngineerDetail")
public class Engineer {
    @Id
    @GeneratedValue
    long engId;
    String engName;
    @Column(name="Designation")
    String engDesignation;
    @Column(name="Salary")
    int engSalary;

    public Engineer() {
    }

    public Engineer(long engId, String engName, String engDesignation, int engSalary) {
        this.engId = engId;
        this.engName = engName;
        this.engDesignation = engDesignation;
        this.engSalary = engSalary;
    }

    public long getEngId() {
        return engId;
    }

    public void setEngId(long engId) {
        this.engId = engId;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getEngDesignation() {
        return engDesignation;
    }

    public void setEngDesignation(String engDesignation) {
        this.engDesignation = engDesignation;
    }

    public int getEngSalary() {
        return engSalary;
    }

    public void setEngSalary(int engSalary) {
        this.engSalary = engSalary;
    }
}
