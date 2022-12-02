package com.example.demospringbootsept.controller.Path_Variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibonacci_Path_Variable {
    @RequestMapping("/fib/{a}/{first}/{second}")
    public String Series(@PathVariable int a,@PathVariable int first,@PathVariable int second){
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
