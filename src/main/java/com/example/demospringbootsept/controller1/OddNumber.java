
    package com.example.demospringbootsept.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class OddNumber {
        @RequestMapping("/odd_number")
        public String PrintOddNumber(){
            String result="Odd Numbers: ";
            for(int i=1;i<=100;i++){
                if(i%2!=0){
                    result=result+" , "+i;
                }
            }
            return result;
        }
    }

