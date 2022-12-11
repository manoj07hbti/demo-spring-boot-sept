package com.example.demospringbootsept.model;

public class Mobile {

    String company;

    int yearOfManufacturing;

    String model;


    public Mobile(String company, int yearOfManufacturing, String model) {
        this.company = company;
        this.yearOfManufacturing = yearOfManufacturing;
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
