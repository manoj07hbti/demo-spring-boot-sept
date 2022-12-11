package com.example.demospringbootsept.model;

public class Mobile {
    String brand;
    String model;
    int ram;
    int storage;

    public Mobile(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
