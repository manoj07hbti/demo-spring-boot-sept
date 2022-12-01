package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_Fibonacci_ {

    @RequestMapping("/fib")
    public String fib() {

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int count=20;

          String result="Fibonacci series 0to20  :";
          result =result+n1+""+n2;
          for (int i=0;i<count;++i){
              n3=n1+n2;
              n1=n2;
              n2=n3;

              result=result +"::"+n3;

          }
          return result;


    }

}
