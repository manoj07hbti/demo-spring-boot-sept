package com.example.demospringbootsept.model1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engineer {
    @Id
    long roll_no;
    @Column(name="Student_Name")
    String name;
   // int roll_no;
    int age;
    String Section;

    public Engineer() {
    }


    public Engineer(String name, long roll_no, int age, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        Section = section;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

}
