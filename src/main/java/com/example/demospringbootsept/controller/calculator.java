package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    @RequestMapping("/add")
    public int add(){
        int a= 24;
        int b= 12;
        int add= a+b;
        return add;
    }
    @RequestMapping("/subtraction")
    public int subtraction(){
        int a= 24;
        int b= 12;
        int sub= a-b;
        return sub;
    }
    @RequestMapping("/multiply")
    public int multiply(){
        int a= 24;
        int b= 12;
        int multi= a*b;
        return multi;
    }
    @RequestMapping("/divide")
    public int divide(){
        int a= 24;
        int b= 12;
        int div= a/b;
        return div;
    }
    
}
