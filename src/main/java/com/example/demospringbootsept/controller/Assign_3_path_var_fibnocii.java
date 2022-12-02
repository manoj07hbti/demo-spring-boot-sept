package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_3_path_var_fibnocii {
    @RequestMapping("/fib/{num}")
    public String fibnocii(@PathVariable int num){
        int a = 0;
        int b = 1;
        int c;
        String result =  "fibnocii series up to "+num+" is  :";
        result =  result + a+", "+b;
        for (int i = 0; i<20; i++) {
            c = a + b;
            a = b;
            b = c;
            result = result+", "+c;
        }
        return result;
    }
}
