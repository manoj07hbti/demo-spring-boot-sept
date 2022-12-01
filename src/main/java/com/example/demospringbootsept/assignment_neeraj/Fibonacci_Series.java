package com.example.demospringbootsept.assignment_neeraj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibonacci_Series {

    // create method

    @RequestMapping("/fib")
    public String fibonacci() {

        int a = 0;
        int b = 1;
        int c;
        String result = "Fibonacci series up to 20 is  :";
        result = result + a + ", " + b;
        for (int i = 0; i <=20; i++) {
            c = a + b;
            a = b;
            b = c;
            result = result + ", " + c;
        }
        return result;
    }
}
