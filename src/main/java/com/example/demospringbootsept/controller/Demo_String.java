package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_String {


    @RequestMapping("/My fist")
    public String welcome(){

        String msg="this is my fist demo spring class";



        return msg;

    }

}
