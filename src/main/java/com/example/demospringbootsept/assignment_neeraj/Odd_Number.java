package com.example.demospringbootsept.assignment_neeraj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_Number {

    // create method
    @RequestMapping("/oddNumber")
    public String printOddNumber(){

        String result = " Odd  number 1 to 100 are : ";

        for (int i = 1; i <= 100; i++) {

            if (i % 2 - 1 == 0) {
                result = result + " , " + i;

            }
        }
        return result;
    }

    }






