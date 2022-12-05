package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibinocci_Path {

    @RequestMapping("/fibinocci/{num}")
    public String Fibinocii(@PathVariable int num) {
        int number= 0;
        int a=0;
        int b=1;
        int c;
        String result="Fibonocci Series";
        result =result +a+" ,"+b;
        for (int i=0; i<20; i ++){
            c= a+b;
            a= b;
            b= c;
            result = result +","+c;
        }
        return result;

    }
}
