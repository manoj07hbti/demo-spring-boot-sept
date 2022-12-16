package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="SOLDIER_LIST")
public class SOLDIER {

    String name;
    @Id
    @GeneratedValue
    int soldierNo;
    String weapon;

    String rank;

    public SOLDIER() {
    }

    public SOLDIER(String name, String rank, String weapon, int soldierNo) {
        this.name = name;
        this.rank = rank;
        this.weapon = weapon;
        this.soldierNo = soldierNo;
    }
    // getter&&setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getSoldierNo() {
        return soldierNo;
    }

    public void setSoldierNo(int soldierNo) {
        this.soldierNo = soldierNo;
    }
}
