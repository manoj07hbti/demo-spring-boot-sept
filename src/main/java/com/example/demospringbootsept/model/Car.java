package com.example.demospringbootsept.model;

public class Car {

    String brand;

    int price;

    int wheel;

    public Car(String brand, int price, int wheel) {
        this.brand = brand;
        this.price = price;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setWheel() {
    }
}
