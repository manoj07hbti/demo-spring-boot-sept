package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/welcome_msg")
    public String welcome(@RequestParam String name){

        return "Welcome to Spring boot request param = "+name;
    }

    @RequestMapping("/voting_agra")
    public String voting(@RequestParam int age, @RequestParam String city){

        if (age>=18 && city.equals("AGRA")){
          return "Person is illigible for voting in agra";
        }
        else {
            return "Person is NOT illigible for voting in agra";
        }
    }

    @RequestMapping("/addition")
    public String addition(@RequestParam int a,@RequestParam int b){
        String msg="";
        int sum=a+b;
        msg="Addition of ab is: "+sum;
        return msg;
    }
}
