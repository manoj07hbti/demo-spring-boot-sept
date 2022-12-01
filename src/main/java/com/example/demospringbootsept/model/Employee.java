package com.example.demospringbootsept.model;

public class Employee {

    String Name;
    int age;
    String sector;
    String place;

    public Employee(String name, int age, String sector, String place) {

        Name = name;
        this.age = age;
        this.sector = sector;
        this.place = place;
    }


    // getter&&setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
