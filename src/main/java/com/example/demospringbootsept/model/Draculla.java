package com.example.demospringbootsept.model;

public class Draculla {

    String name;
    int bodySize;
    int teethsize;

    public Draculla(String name, int bodySize, int teethsize) {
        this.name = name;
        this.bodySize = bodySize;
        this.teethsize = teethsize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }

    public int getTeethsize() {
        return teethsize;
    }

    public void setTeethsize(int teethsize) {
        this.teethsize = teethsize;
    }
}
