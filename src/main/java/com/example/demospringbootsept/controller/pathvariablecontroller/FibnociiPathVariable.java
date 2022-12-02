package com.example.demospringbootsept.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibnociiPathVariable {
    @RequestMapping("/fibn/{mgs}")  ///locahost:9090/fibn/
    public String fibonacii(@PathVariable int mgs) {
        int number= 0;
        int a=0;
        int b=1;
        int c;
        String result="Fibnocii";
        result =result +a+" ,"+b;
        for (int i=0; i<20; i ++){
            c= a+b;
            a= b;
            b= c;
            result = result +","+c;
        }
        return result;

    }
}
