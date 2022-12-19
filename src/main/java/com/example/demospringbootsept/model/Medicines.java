package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medicines {
    @Id
    @GeneratedValue
    int md_number;
    String medicineName;
    double price;

    public Medicines() {
    }

    public Medicines(int md_number, String medicineName, double price) {
        this.md_number = md_number;
        this.medicineName = medicineName;
        this.price = price;
    }

    public int getMd_number() {
        return md_number;
    }

    public void setMd_number(int md_number) {
        this.md_number = md_number;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
