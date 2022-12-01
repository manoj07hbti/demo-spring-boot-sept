package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_Controller {


    @RequestMapping("/armstrong")
    public String armstrong() {

        String result = null;

        int num = 243, digit, num1, sum = 0;

        while (num != 0) {
            digit = num % 10;
            num1 = digit * digit * digit;

            sum = sum + num1;

            num = num / 10;


            if (sum == num) {
                result = "243 is an Armstrong number";
            } else {
                result = "243 is not an Armstrong number";
            }
        }
        return result;
    }
}
