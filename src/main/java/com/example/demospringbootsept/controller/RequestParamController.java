package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {


    @RequestMapping("/welcome_msg")
    public String welcome(@RequestParam String name){

        return "Welcome to Spring boot with Request param :"+name;
    }

    @RequestMapping("/vote_agra")
    public String voting(@RequestParam int age,@RequestParam String city){

        if(age>=18 && city.equals("AGRA")){

            return "Eligible for voting in AGRA";
        }
        else {

            return "NOT Eligible for voting in AGRA";
        }


    }

}
