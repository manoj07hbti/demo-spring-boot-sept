package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestParam_Calculator_Controller {

    @RequestMapping("/add_request_param")
    public String addition(@RequestParam int x, @RequestParam int y){

        String result ="";

        int sum=x+y;

        result = "Addition is : "+sum;

        return result;
    }

    @RequestMapping("/sub_request_param")
    public String subtraction(@RequestParam int x, @RequestParam int y){

        String result ="";

        int sub =x-y;

        result = "Subtraction is : "+sub;

        return result;
    }

    @RequestMapping("/mul_request_param")
    public String multiplication(@RequestParam int x, @RequestParam int y){

        String result ="";

        int mul=x*y;

        result = "Multiplication is : "+mul;

        return result;
    }
    @RequestMapping("/div_request_param")
    public String division(@RequestParam int x, @RequestParam int y){

        String result ="";

        int div=x/y;

        result = "Division is : "+div;

        return result;
    }




}
