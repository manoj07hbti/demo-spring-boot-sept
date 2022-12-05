package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Fibonocci {
      @RequestMapping("/fibinocci")
        public String Fibinocci_Series() {
            int number= 0;
            int a=0;
            int b=1;
            int c;
            String result="Fibonocci Series";
            result =result +a+" ,"+b;
            for (int i=0; i<20; i ++){
                c= a+b;
                a= b;
                b= c;
                result = result +","+c;
            }
            return result;

        }
}
