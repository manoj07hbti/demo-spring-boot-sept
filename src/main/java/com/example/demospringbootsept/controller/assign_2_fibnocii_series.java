package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*1- print odd numbers 1 to 100
        2- print fibnocii series 0 to 20
        3- print Employee data
        4- print all Employees data
        5- calculate percentage
        6- Armstrong number : 243 is Armstrong number , 243 is not Armstrong number*/

@RestController
public class assign_2_fibnocii_series {

    @RequestMapping("/fib")
    public String fibnocii(){
        int num = 0;  //0 1 1 2 3 5 8 13
        int a = 0;
        int b = 1;
        int c;
        String result =  "fibnocii series up to 20 is  :";
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
