package com.example.demospringbootsept.model;

public class Vehicle {
    String company, model;
    double price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String company, String model, double price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }
}
