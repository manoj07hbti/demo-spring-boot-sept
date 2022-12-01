package com.example.demospringbootsept.assignmentControler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {



@RequestMapping("/add")
    public int add(){

        int a = 10;
        int b = 20;
        return a+b;

    }
    @RequestMapping("/sub")
    public int sub(){
        int a = 20;
        int b = 10;
        return a-b;
    }
    @RequestMapping("/div")
    public int div(){
        int a = 20;
        int b = 10;
        return a/b;
    }
    @RequestMapping("/mul")
    public int mul(){
        int a = 10;
        int b = 5;
        return a*b;
    }


}
