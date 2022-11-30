package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_calculator {


    @RequestMapping("/add")
    public int add(){
        int a=4;
        int b=14;
        return a+b;


    }

    @RequestMapping("/sub")
    public int sub(){
        int x=78;
        int y=12;
        return x-y;

    }
    @RequestMapping("/multi")
    public int multi(){
        int a=45;
        int b=12;
        return a*b;

    }

    @RequestMapping("/div")
    public int div(){

        int a=12;
        int b=3;
        return a/b;
    }


}
