package com.example.demospringbootsept.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonaciSeries {
    @RequestMapping("/numbers")
    public String Fibonacci(){

            int num1=0;
            int num2=1;
            int counter;
            String result="Fibonaci Series from 1 to 20 are: " ;
            result=result+num1+"' "+num2;
            for(int i=0;i<=20;i++){
                counter=num1+num2;
                num1=num2;
                num2=counter;
                result=result+", "+counter;
            }
            return result;

        }

        }








