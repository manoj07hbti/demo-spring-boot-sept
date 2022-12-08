package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ArmstrongNum {
    @RequestMapping("/check_armstrongNum")


    public String armstrongNum( ){
        String result = " ";
        int a = 131,  d, sum = 0;
        int num;
        num=a;
        while(num>0){
            d=num%10;
            sum =sum+(d*d*d);
            num=num/10;
        }
        if(a==sum) {
            result= result+ "Entered No. is Armstrong No.";
        }
        else{
            result=  result+ "Entered No. is not Armstrong No.";
        }
        return result;
    }

}
