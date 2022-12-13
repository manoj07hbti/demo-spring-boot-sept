package com.example.demospringbootsept.model;

public class Vehicles {


    String company;

    String model;

    int price;

    public Vehicles(String company, String model, int price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
