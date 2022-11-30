package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Multi_calculator {
    @RequestMapping("/cube")
    public int cube(){
        int a=45;
        return a*a*a;

    }


    @RequestMapping("/square")
    public int square(){

        int a=78;
        return a*a;


    }




}
