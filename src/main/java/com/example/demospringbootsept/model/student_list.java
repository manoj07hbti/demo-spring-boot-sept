package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student_list {


    String name;
    @Id
    @GeneratedValue
    int RollNo;
    String sub;
    String section;

    public student_list() {
    }

    public student_list(String name, int age, String sub, String section) {
        this.name = name;
        this.RollNo = age;
        this.sub = sub;
        this.section = section;
    }
    // todo=getter&setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return RollNo;
    }

    public void setAge(int RollNo) {
        this.RollNo = RollNo;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
