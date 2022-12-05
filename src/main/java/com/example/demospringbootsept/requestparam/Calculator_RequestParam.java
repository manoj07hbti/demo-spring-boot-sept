package com.example.demospringbootsept.requestparam;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_RequestParam {
    //create method
    @RequestMapping("/add_request_param")     //localhost:port/endpoint/?a=value&b=value&c=value
    public String addition(@RequestParam int a, @RequestParam int b, @RequestParam int c) {

        String msg = " ";
        int sum = a + b + c;
        msg = "Addition is : " + sum;
        return msg;
    }

    @RequestMapping("/sub_request_param")
    public String subtraction(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        String msg = " ";
        int sub = a - b - c;
        msg = "Subtraction is : " + sub;
        return msg;
    }

    @RequestMapping("/multi_request_param")
    public String multi(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        String msg = " ";
        int multi = a * b * c;
        msg = "Multiplication is : " + multi;
        return msg;
    }

    @RequestMapping("/divide_request_param")
    public String Division(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        String msg = " ";
        int divide = a / b / c;
        msg = "Division is : " + divide;
        return msg;

    }
}



