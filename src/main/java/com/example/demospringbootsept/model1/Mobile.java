package com.example.demospringbootsept.model1;

public class Mobile {
    String company;
    int ram;
    String colour;
    int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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

    public Mobile(String company, int ram, String colour, int price) {
        this.company = company;
        this.ram = ram;
        this.colour = colour;
        this.price = price;
    }
}
