package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CC_Controll {

    @RequestMapping("addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        String msg="";

        int sum=a+b;

        msg= "Addition is : "+sum;

        return msg;
    }

    @RequestMapping("/add_request_param")
    public String addition(@RequestParam int a, @RequestParam int b){

        String msg="";

        int sum=a+b;

        msg= "Addition is : "+sum;

        return msg;
    }

}
