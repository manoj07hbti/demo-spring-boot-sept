package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddNumPathVariable {

    @RequestMapping("/odd_num/{num}")
    public String Odd(@PathVariable int num) {

        String result = "odd numbers";
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {

                result = result + " , " + i;
            }
        }

        return result;
    }
}
