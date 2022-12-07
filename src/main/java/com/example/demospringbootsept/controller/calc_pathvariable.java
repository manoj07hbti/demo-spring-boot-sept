package com.example.demospringbootsept.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calc_pathvariable {
    @RequestMapping("/sum/{a}/{b}")
    public String sum(@PathVariable int a, @PathVariable int b){
        String msg="";
        int sum=a+b;
        msg="sum is : "+sum;
        return msg;
    }
    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b){
        String msg="";
        int sub=a-b;
        msg="substraction is : "+sub;
        return msg;
    }
    @RequestMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b){
        String msg="";
        double div=(double)a/b;
        msg="division is : "+div;
        return msg;
    }
    @RequestMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b){
        String msg="";
        int div=a*b;
        msg="multiplication is : "+div;
        return msg;
    }

}

