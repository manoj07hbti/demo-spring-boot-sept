package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_Armstrong_Controller {

    @RequestMapping("/armstrong/{num}")
    public String armstrong(@PathVariable int num) {

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
        }
        else {
            return +num + "number is not an armstrong number";
        }
    }
}

