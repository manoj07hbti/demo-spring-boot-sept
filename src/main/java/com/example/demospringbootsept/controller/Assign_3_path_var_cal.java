package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_3_path_var_cal {
@RequestMapping("/sum/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
       return a+b;
    }
@RequestMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a,@PathVariable int b){
        return a-b;
    }
@RequestMapping("/multi/{a}/{b}")
    public int multi(@PathVariable int a,@PathVariable int b){
        return a*b;
    }
@RequestMapping("/divide/{a}/{b}")
    public double divide(@PathVariable int a,@PathVariable int b){
        return (double)a/b;
    }
}
