package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_Calculator_Controller {

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {

        String output = "  ";
        int sum = a + b;

        output = "Addition of a and b is :  " + sum;

        return output;

    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {

        String output = "  ";
        int sub = a - b;

        output = "Subtraction of a and b is  :  " + sub;

        return output;


    }

    @RequestMapping("/multiplication/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b) {

        String output = "  ";
        int mul = a * b;

        output = "Multiplication of a and b is  :  " + mul;

        return output;


    }

    @RequestMapping("/division/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {

        String output = "  ";
        int div = a / b;

        output = "division of a and b is  :  " + div;

        return output;


    }
}
