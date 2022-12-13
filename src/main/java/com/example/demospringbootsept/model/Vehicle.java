package com.example.demospringbootsept.model;

public class Vehicle {

    String vehicleType;
    String vehicleName;
    int price;
    int power;

    public Vehicle(String vehicleType, String vehicleName, int price, int power) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.price = price;
        this.power = power;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
