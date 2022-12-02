package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Assign_3_path_var_armstrong {

        @RequestMapping("/armstrong/{num}")
        public String armstrong(@PathVariable  int num){
            String result;
            //int num = 371;
            int unit = num%10;
            int second = num%100/10;
            int third = num/100;
            if(Math.pow(unit,3)+Math.pow(second,3)+Math.pow(third,3) == num ){
                result = "Given number " + num + " is an armstrong number";
            }
            else{
                result = "Given number " + num + " is not an armstrong number";
            }
            return result;
        }
    }

