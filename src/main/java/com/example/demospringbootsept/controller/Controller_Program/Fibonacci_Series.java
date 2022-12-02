package com.example.demospringbootsept.controller.Controller_Program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibonacci_Series {
    @RequestMapping("/fibonacci")
    public String Series(){
        String result=" This is fibonacci series:- ";
        int a=10;
        int first =1;
        int second=1;
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
