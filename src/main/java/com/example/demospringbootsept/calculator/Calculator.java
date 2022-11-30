package com.example.demospringbootsept.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/add")
    public int addition(){
        int a=4;
        int b=5;
        return a+b;
    }

    @RequestMapping("/sub")
    public int substraction(){
        int a=6;
        int b=4;
        return a-b;
    }

    @RequestMapping("/multi")
    public int multiplication(){
        int a=2;
        int b=5;
        return a*b;
    }

    @RequestMapping("/div")
    public double division(){
        double a=8;
        double b=2;
        return a/b;
    }
}
