package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestParam_OddEven_Controller {

    @RequestMapping("/check_odd/even_request_param")
    public String OddEven(@RequestParam int number) {

        String output = "  ";

        if (number % 2 == 0) {
            output = number+ "Number is EVEN";

        } else {

            output = number+ " Number is ODD";
        }

        return output;
    }

}

