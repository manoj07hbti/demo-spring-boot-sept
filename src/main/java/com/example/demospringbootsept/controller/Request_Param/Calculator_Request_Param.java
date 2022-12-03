package com.example.demospringbootsept.controller.Request_Param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Request_Param {
    @RequestMapping("/addition")
    public String add(@RequestParam int a, @RequestParam int b){
        String result ="";
        int add= a+b;
        result = " Adding two num "+add;
        return result;
    }

    @RequestMapping("/sub")
    public String subtraction(@RequestParam int a,@RequestParam int b){
        String result ="";
        int sub= a-b;
        result = " Subtraction two num: "+sub;
        return result;
    }

    @RequestMapping("/multi")
    public String multiply(@RequestParam int a,@RequestParam int b){
        String result ="";
        int multi= a*b;
        result = " Multiply two num: "+multi;
        return result ;
    }

    @RequestMapping("/div")
    public String divide(@RequestParam int a, @RequestParam int b){
        String result ="";
        int div= a/b;
        result = " divide two num: "+div;
        return result ;
    }
}
