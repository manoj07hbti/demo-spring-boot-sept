package com.example.demospringbootsept.path_variable_controller1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddNumberController {
    @RequestMapping("/check/{number}")
    public String checkNumber(@PathVariable int number) {
        String obj = " ,";
        if (number % 2 == 0) {
            obj = number + "number is even number";
        } else {
            obj = number + " number is odd number";
        }
        return obj;
    }


    }

