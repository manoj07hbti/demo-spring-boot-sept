package com.example.demospringbootsept.controllerMath;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @RequestMapping("/fibonaci")
    public String fibnocii() {


        int num = 0;

        int num1 = 0;
        int num2 = 1;
        int num3;

        String result = "fibnocii series up to 10 is..";
        result = result + num1 + ", " + num2;

        for (int i = 0; i < 10; i++) {
        num3=num1+num2;
        num1=num2;
        num2=num3;

        result =result+", "+num3;
        }
        return result;


    }
}
