package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class D_Controller {
    @RequestMapping("/additon")
    public int addition(){
        int a=10;
        int b=10;
        return a+b;
    }

    @RequestMapping("/multiply")
    public int multiply(){
        int a=5;
        int b=10;
        return a*b;
    }
    @RequestMapping("/welcome")
    public String welcome(){
        String name="this is my first step on Google😍😍 felling Fresh🤣🤣🤣🤣🤣🤣🤣";
        return name;
    }





}
