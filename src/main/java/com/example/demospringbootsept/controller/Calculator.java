package com.example.demospringbootsept.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/ADD")
    public int add(){
        int a= 20;
        int b = 30;

        return a+b;
    }

    @RequestMapping("/SUB")
    public int sub(){
        int a= 60;
        int b = 30;

        return a-b;
    }


    @RequestMapping("/MUL")
    public int mul(){
        int a= 20;
        int b = 30;

        return a*b;
    }

    @RequestMapping("/DIV")
    public int div(){
        int a= 60;
        int b = 30;

        return a/b;
    }



}
