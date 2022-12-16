package com.example.demospringbootsept.repository;


import org.springframework.stereotype.Repository;

@Repository
public class EngineerAppFlow {

    public String message(){

        return "RESPONSE FROM REPOSITORY LAYER------>";
    }
}
