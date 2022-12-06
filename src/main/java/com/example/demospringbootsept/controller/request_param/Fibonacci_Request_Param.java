package com.example.demospringbootsept.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibonacci_Request_Param {
    @RequestMapping("/Fibonacci")
    public String Series(@RequestParam int a, @RequestParam int first, @RequestParam int second){
        String result=" This is fibonacci series:- ";
        int current=first;
        result = result+  second;
        for (int i=0 ;i<a;i++){
            System.out.println(result);
            if (i <current){
                current =  first + second;
                second=first;
                first=current;
            }
            result = result + ","+ current;
        }
        return result;
    }
}
