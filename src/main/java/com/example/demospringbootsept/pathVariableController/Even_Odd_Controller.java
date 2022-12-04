package com.example.demospringbootsept.pathVariableController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_Odd_Controller {

    @RequestMapping("/even/{a}")
    public String evenOdd(@PathVariable int a){

        String value=" ";

        if (a%2==0){
            value="This number is even....";
        }

        else{
            value="This number is odd....";
        }

        return value;
    }
}
