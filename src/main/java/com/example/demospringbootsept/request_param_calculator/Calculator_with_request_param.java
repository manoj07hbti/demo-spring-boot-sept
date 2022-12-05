package com.example.demospringbootsept.request_param_calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_with_request_param {

    @RequestMapping("/add_with_request_param")
    public String addition(@RequestParam double a, @RequestParam double b) {

        String msg = " ";
        double sum = a + b;
        msg = "Addition (a+b) is------------->" + sum;
        return msg;
    }

    @RequestMapping("/sub_with_request_param")
    public String subtraction(@RequestParam double a, @RequestParam double b) {
        String msg = " ";
        double sub = a - b;
        msg = "Subtraction (a-b) is--------->" + sub;
        return msg;
    }

    @RequestMapping("/multi_with_request_param")
    public String multi(@RequestParam double a, @RequestParam double b) {
        String msg = " ";
        double multi = a * b;
        msg = "Multi (a*b) is-------------> " + multi;
        return msg;
    }

    @RequestMapping("/divide_with_request_param")
    public String Division(@RequestParam int a, @RequestParam int b) {
        String msg = " ";
        int divide = a / b ;
        msg = "Divide (a/b) is----------->" + divide;
        return msg;

    }
}

