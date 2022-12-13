package com.example.demospringbootsept.model;

public class Vehicle {
    String name;
    String model;
    double size;
    double prize;

    public Vehicle(String name, String model, double size, double prize) {
        this.name = name;
        this.model = model;
        this.size = size;
        this.prize = prize;
    }

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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
