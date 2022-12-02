package com.example.demospringbootsept.path_variable_assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_path_variable {

    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable  int a,@PathVariable int  b){

        String output="  ";

         int add=a+b;

         output="add of two number------->>"+add;

         return output;

    }

    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){

        String output=" ";

        int sub=a-b;

        output="sub of two number------->"+sub;

        return output;
    }


    @RequestMapping("/multi/{a}/{b}")
    public String multi(@PathVariable int a,@PathVariable int b){

        String output=" ";

        int multi=a*b;

        output="multi of two number------->"+multi;

        return output;
    }
    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a,@PathVariable int b){

        String output=" ";

        int divide=a/b;

        output="divide of two number-------->"+divide;

        return output;
    }
}


