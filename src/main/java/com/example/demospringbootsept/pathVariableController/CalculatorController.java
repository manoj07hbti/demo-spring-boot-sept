package com.example.demospringbootsept.pathVariableController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){

        String value="  ";

        int add=a+b;

        value="Two value addition is...." +add;
        return value;

    }
    @RequestMapping("/sub/{a}/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b){

        String value="  ";

        int sub=a-b;
        value="Two value subtraction is...." +sub;
        return value;

    }

    @RequestMapping("/multiple/{a}/{b}")
    public String multiple(@PathVariable int a, @PathVariable int b){

        String value="  ";

        int mul=a*b;
        value="Two value multiple is...." +mul;
        return value;

    }

    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){

        String value="  ";

        int divide=a/b;
        value="Two value divide is...." +divide;
        return value;

    }


}
