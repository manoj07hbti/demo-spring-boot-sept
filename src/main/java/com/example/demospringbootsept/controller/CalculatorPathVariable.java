package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
public class CalculatorPathVariable {
    @RequestMapping("/add/{a}/{b}")
public String add (@PathVariable int a, @PathVariable int b){
    String msg=" ";
    int sum = a+b;
    msg= "Addition is : " +sum;
    return msg;

}
@RequestMapping("/sub /{x}/{y}")
public String sub(@PathVariable int x, @PathVariable int y){
        String msg= " ";
        int sub =x-y;
        msg= "subtraction is : " +sub;
        return msg;
}
@RequestMapping("/multi /{n}/{m}")
public String multi(@PathVariable int n,@PathVariable int m){
        String msg = " ";
        int multi = n*m;
        msg= "multiply is : " +multi;
        return msg;
}
@RequestMapping("/divide_3/{e}/{f}")
public String divide(@PathVariable int e, @PathVariable int f){
        String msg = " ";
        int  divide = e/f;
        msg= "divide is : " +divide;
        return msg;
}
}
