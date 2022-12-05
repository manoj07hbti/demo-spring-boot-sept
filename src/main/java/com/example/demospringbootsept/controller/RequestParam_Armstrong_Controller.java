package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestParam_Armstrong_Controller {


    @RequestMapping("/armstrong_request_param")
    public String armstrong(@RequestParam int num) {

        int n, digits = 0, last = 0, sum = 0;

        n = num;

        while (n > 0) {
            n = n / 10;
            digits++;
        }
        n = num;
        while (n > 0) {

            last = n % 10;

            sum += (Math.pow(last, digits));

            n = n / 10;
        }

        if (num == sum) {

            return +num + "number is an armstrong number";
        } else {
            return +num + "number is not an armstrong number";
        }
    }
}
