package com.example.demospringbootsept.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibnocii {
@RequestMapping("/fibnocii")  ///locahost:9009/fibnocii
    public String fibonacii() {
        int number= 0;
        int a=0;
        int b=1;
        int c;
        String result="Fibnocii";
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