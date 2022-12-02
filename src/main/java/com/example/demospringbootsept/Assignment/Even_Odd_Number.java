package com.example.demospringbootsept.Assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_Odd_Number {
    // create method
    @RequestMapping("/checkNumber/{number}")
    public String evenOddNumber(@PathVariable int number) {

        String msg = " ";

        if(number%2==0){


            msg = number+ " Number is Even Number ";

        }
        else{
            msg = number+"  Number is Odd Number " ;
        }
          return  msg;
    }
}


