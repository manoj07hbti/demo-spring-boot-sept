package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fiboncii_Controller {


    @RequestMapping("/fibonacii")
    public String fiboncii() {

        int n1 = 0, n2 = 1, n3, i, count = 20;

        String result = "fibonacii series 0 to 20  :";
        result = result + n1 + " " + n2;            //printing 0 and 1

        for (i = 2; i < count; ++i)                  //loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            result = result + "  ,  " + n3;

        }
        return result;
    }
}

