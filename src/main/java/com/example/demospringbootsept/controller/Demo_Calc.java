package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
public class Demo_Calc {
    @RequestMapping("/add")
    public int add(){

        int a=10;
        int b=22;

        return (a+b);
    }
    @RequestMapping("/sub")
    public int sub(){

        int a=199;
        int b=56;

        return (a-b);

    }
    @RequestMapping("/multi")
    public int multi(){

        int a=5;
        int b=56;

        return (a*b);
    }
    @RequestMapping("/divide")
    public int divide(){

        int a=100;
        int b=5;

        return(a/b);
    }
}
