package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_Path {

    @RequestMapping("/armstrong/{num}")
    public String arm_strong(@PathVariable int num) {

        String msg = "";
        int num1= 243 , originalnum , remainder, result = 0;
        originalnum = num;
        while (originalnum != 0){
            remainder = originalnum%10;
            result += Math.pow(remainder ,3);
            originalnum/= 10;
        }
        if (result==num){
            msg = num +" is an armstrong number";
        }
        else {
            msg = num +" is not an armstrong number";
        }
        return msg;
    }


}
