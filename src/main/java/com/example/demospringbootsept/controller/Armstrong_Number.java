package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_Number {
    @RequestMapping("/armstrong")
    public  String armstrong(){
        String msg ="";
        int num=123;
        int realNam,remainder,result=0;
        realNam=num;
        while (realNam!=0){
            remainder= realNam%10;
            result = result +remainder*remainder*remainder;
            realNam /= 10;
        }
        if (result==num){
            msg = num +" is an armstrong";
        }
        else {
            msg = num +" is not an armstrong";
        }
        return msg;
    }
}
