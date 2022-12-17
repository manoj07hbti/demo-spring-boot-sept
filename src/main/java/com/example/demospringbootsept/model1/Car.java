package com.example.demospringbootsept.model1;

public class Car {
    String name;
    float price;
    int model;
    String colour;

    public Car(String name, float price, int model, String colour) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
}
