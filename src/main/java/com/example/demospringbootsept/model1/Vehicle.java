package com.example.demospringbootsept.model1;

public class Vehicle {
    String company;
    String type;
    int model;
    String colour;
    int price;

    public Vehicle(String company, String type, int model, String colour, int price) {
        this.company = company;
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
