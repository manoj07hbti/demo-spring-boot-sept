package com.example.demospringbootsept.model;

public class Mobile {
    String name;
    String processor;
    String primaryCamera;
    String network;
    int price;

    //todo parameterized constructor


    public Mobile(String name, String processor, String primaryCamera, String network, int price) {
        this.name = name;
        this.processor = processor;
        this.primaryCamera = primaryCamera;
        this.network = network;
        this.price = price;
    }

    public Mobile() {
    }

    //todo getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(String primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
