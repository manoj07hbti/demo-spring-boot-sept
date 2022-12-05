package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ArmStrong_Num {
       @RequestMapping("/armstrong")
        public String arm_strong() {

            String msg = "";
            int num= 243 , originalNum , remainder, result = 0;
            originalNum = num;
            while (originalNum != 0){
                remainder = originalNum%10;
                result += Math.pow(remainder ,3);
                originalNum/= 10;
            }
            if (result==num){
                msg = num +" is an Armstrong number";
            }
            else {
                msg = num +" is not an Armstrong number";
            }
            return msg;
        }
}
