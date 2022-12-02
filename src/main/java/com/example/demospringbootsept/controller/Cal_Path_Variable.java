package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cal_Path_Variable {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        String result ="";
        int add= a+b;
        result = " Adding two num "+add;
        return result;
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String subtraction(@PathVariable int a,@PathVariable int b){
        String result ="";
        int sub= a-b;
        result = " Subtraction two num: "+sub;
        return result;
    }

    @RequestMapping("/multiply/{a}/{b}")
    public String multiply(@PathVariable int a,@PathVariable int b){
        String result ="";
        int multi= a*b;
        result = " Multiply two num: "+multi;
        return result ;
    }

    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a,@PathVariable int b){
        String result ="";
        int div= a/b;
        result = " divide two num: "+div;
        return result ;
    }
}
