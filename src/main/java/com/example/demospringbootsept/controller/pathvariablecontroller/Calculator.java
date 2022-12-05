package com.example.demospringbootsept.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @RequestMapping("/add12/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){
        String msg="";
        int add= a+b;
        msg= "Addition---:"+add;
        return msg;

    }
    @RequestMapping("/sub1/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        String result= "";
        int sub=a-b;
        result="Substraction--:"+result;
        return result;
    }
    @RequestMapping("/multi1/{a}/{b}")
    public String multi(@PathVariable int a, @PathVariable int b){
        String result="";
        int multi=a*b;
        result="multification---:"+result;
        return result;
    }
    @RequestMapping("/div/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){
        String result="";
        int divide=a/b;
        result="multification---:"+result;
        return result;
    }

}
