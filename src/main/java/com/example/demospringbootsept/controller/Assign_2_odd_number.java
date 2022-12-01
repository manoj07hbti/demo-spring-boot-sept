package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_2_odd_number {

    @RequestMapping("/odd")
    public String odd(){
        String result = "The odd numbers between 1 to 100 are : ";
        for (int i=1; i<100; i=i+2){
            result = result+", "+i;
        }
        return result;
    }
}
