package com.example.demospringbootsept.request_param_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NumberController {
    @RequestMapping("/armstrong_check")

    public String number(@RequestParam int num) {
String result;
int unit=num%10;
int second=num%100/10;
int last=num/100;
if(Math.pow(unit,3)+Math.pow(second,3)+Math.pow(last,3)==num){
    result=num+" is the armstrong number";
}
else{result=num+" is not an armstrong number";}
return result;

    }


}
