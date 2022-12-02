package com.example.demospringbootsept.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_voting {

    @RequestMapping("/voting/{city}/{age}")
    public String checkAge(@PathVariable @NotNull String city , @PathVariable int age){

        String msg="";

        if (city.equals("kanpur")&& age>=18){
            msg="person is eligible for voting in kanpur";

        }
        else {
            msg="person is not eligible for voting in kanpur";

        }
        return msg;
    }
}
