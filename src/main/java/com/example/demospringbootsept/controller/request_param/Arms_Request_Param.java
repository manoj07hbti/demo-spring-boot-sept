package com.example.demospringbootsept.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arms_Request_Param {
    @RequestMapping("/arms")
    public  String arms_check(@RequestParam int num){
        String msg ="";
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
