package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company_m {
    @Id
    String name;
   double list_price;
  // @Column(name="sales(in cr.)")
    double sales;

    public Company_m() {
    }

    public Company_m(String name, double list_price, double sales) {
        this.name = name;
        this.list_price = list_price;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
