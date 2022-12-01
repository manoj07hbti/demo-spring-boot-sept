package com.example.demospringbootsept.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_Even_Number {
@RequestMapping("/even")  //localhost:9009/even
    public String Even(){

        String result="";
        for (int i = 1;i<=100; i++){

            if (i%2==0){
                result=result +" , " +i;
            }
        }
        return result;
    }
    @RequestMapping("/odd")  //localhost:9009/odd
    public String Odd(){

        String result="";
        for (int i = 1;i<=100; i++){

            if (i%3==0){
                result=result +" , " +i;
            }
        }
        return result;
    }

}
