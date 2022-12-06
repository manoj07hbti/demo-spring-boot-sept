package com.example.demospringbootsept.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_Number {
    @RequestMapping("/armstrong_no")
    public String number() {
        String result = "";
        int num1 = 371;
        int power = num1 % 10;     //for unit digit
        int num2 = num1 % 100 / 10;    //for second digit
        int num3 = num1 / 100;          //for last digit
        if (Math.pow(power, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == num1) {
            result = "Given number" + num1 + " is an armstrong number";
        } else {
            result = "Given number" + num1 + " is not an armstrong number";
        }
        return result;


    }
}