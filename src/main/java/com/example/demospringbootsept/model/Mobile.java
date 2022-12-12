package com.example.demospringbootsept.model;

public class Mobile {
    String name;
    String model;
    int price;
    String brand;

    public Mobile(String name, String model, int price, String brand) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.brand = brand;
    }
    //getter && setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
