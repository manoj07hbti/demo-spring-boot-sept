package com.example.demospringbootsept.repository;


import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String message(){

        return "Response from Repository Layer";
    }


}
