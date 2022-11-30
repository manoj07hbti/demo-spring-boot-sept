package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {
    @RequestMapping("/add1")
    public int add(){
        int x =12;
        int y =12;
        return x+y;
    }
    @RequestMapping("/sub1")
    public int sub (){
        int x=10;
        int y=5;
        return x-y;
    }
    @RequestMapping("/deivde1")
    public int devide(){
        int x = 100;
        int y = 10;
        return x/y;

    }
    @RequestMapping("/multi1")
    public int multi(){
        int x=6;
        int y=4;
        return x*y;
    }


}
