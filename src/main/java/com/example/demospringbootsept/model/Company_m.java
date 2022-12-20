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

}
