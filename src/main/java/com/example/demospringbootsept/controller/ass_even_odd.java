package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_even_odd {


@RequestMapping("/even/{a}")
    public String even(@PathVariable int a){


        String num="";

        if (a%2==0){
            num="number is even:";

        }
        else {
            num="number is odd";


        }
        return num;

    }

}
