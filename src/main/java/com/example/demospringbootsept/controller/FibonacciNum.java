package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FibonacciNum {
@RequestMapping("/fibonacciNum")
    public String fibonacciNum(){
    int n = 20, firstTerm = 0, secondTerm = 1, nextTerm, i;
    //System.out.println("");
    String result ="";
     result ="Fibonacci Series till " + n + " terms:";
        for ( i = 1; i <= n; ++i)

    {
        // System.out.print(firstTerm + ", ");

        // compute the next term
       nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        result = result + " , " + nextTerm;
    }
        return result;
    }


}
