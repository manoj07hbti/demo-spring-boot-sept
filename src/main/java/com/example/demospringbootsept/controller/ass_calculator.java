package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_calculator {

    @RequestMapping("add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        String number="";

        int sum=a+b;

        number="add is :"+sum;

        return number;



    }
    @RequestMapping("sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){

        String num="";

        int sub=a-b;

        num="sub is :"+sub;

        return num;
    }
    @RequestMapping("/multi/{a}/{b}")
    public String multi(@PathVariable int a,@PathVariable int b){

        String var="";

        int multi=a*b;

        var="multi is :"+multi;

        return var;


    }
    @RequestMapping("/div/{a}/{b}")
    public String div(@PathVariable int a,@PathVariable int b){

        String num="";

        int div=a/b;

        num="div is :"+div;

        return num;

    }
}
