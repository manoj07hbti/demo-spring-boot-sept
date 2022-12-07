package com.example.demospringbootsept.request_param_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controller {
    @RequestMapping("/adding")
    public String addition(@RequestParam int a, @RequestParam int b) {

        int c = a + b;
        String result = "the addition of the number is:" + c;
        return result;
    }

    @RequestMapping("/subtracting")
    public String subtraction(@RequestParam int a, @RequestParam int b) {

        int c = a + b;
        String result = "the subtraction of the number is:" + c;
        return result;

    }

    @RequestMapping("/multiplying")
    public String multiply(@RequestParam int a, @RequestParam int b) {

        int c = a * b;
        String result = "the multiply of the number is:" + c;
        return result;
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {

        float c = (float)a / b;
        String result = "the division of the number is:" + c;
        return result;
    }
}
