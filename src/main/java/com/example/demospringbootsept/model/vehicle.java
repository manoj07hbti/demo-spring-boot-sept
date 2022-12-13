package com.example.demospringbootsept.model;

public class vehicle {
    String name;
    String engineCapacity;
    String mileage;
    String kerbWeight;

    //todo parameterized conductor

    public vehicle(String name, String engineCapacity, String mileage, String kerbWeight) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.kerbWeight = kerbWeight;
    }

    public vehicle() {
    }

    //todo getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getKerbWeight() {
        return kerbWeight;
    }

    public void setKerbWeight(String kerbWeight) {
        this.kerbWeight = kerbWeight;
    }
}
