package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_4_req_param_cal {
    @RequestMapping("/add_pera")
    public int add(@RequestParam int a, @RequestParam int b){
        return a+b;
    }

 @RequestMapping("/sub_pera")
    public int sub(@RequestParam int a, @RequestParam int b){
        return a-b;
    }

 @RequestMapping("/multi_pera")
    public int multi(@RequestParam int a, @RequestParam int b){
        return a*b;
    }

 @RequestMapping("/div_pera")
    public double div(@RequestParam int a, @RequestParam int b){
     return (double)a/b;
    }
}

