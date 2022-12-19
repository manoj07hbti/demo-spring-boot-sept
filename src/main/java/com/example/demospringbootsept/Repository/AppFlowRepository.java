package com.example.demospringbootsept.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {


    public String message(){

        return "response from repository layer";
    }
}
