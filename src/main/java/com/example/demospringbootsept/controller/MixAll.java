package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixAll {

    @RequestMapping("/aadd")
    public int add(){

        int a=10;
        int b=20;
        return a+b;
    }
    @RequestMapping("/mmll")
    public int mul(){
        int a=10;
        int b=20;
        return a*b;
    }
    @RequestMapping("/mmnn")
    public int min(){
        int a=100;
        int b=21;
        return a-b;
    }
}
