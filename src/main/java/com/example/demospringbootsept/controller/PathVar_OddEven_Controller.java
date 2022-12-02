package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_OddEven_Controller {

    @RequestMapping("/check_odd/even/{number}")
    public String OddEven(@PathVariable int number) {

        String output = "  ";

        if (number % 2 == 0) {
            output = number+ "Number is EVEN";

        } else {

            output = number+ " Number is ODD";
        }

        return output;
    }

}
