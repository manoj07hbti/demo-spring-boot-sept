package com.example.demospringbootsept.assignmentController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3PathVariableController {
@RequestMapping("/check_odd_day3/{number}")
    public String checkOdd(@PathVariable int number){

        String result = "" ;

        for(int i = 0 ; i <= number; i++)
        {
            if (i%2 != 0){

                result =  i+ " is Odd";
            }
            else {
                result = number +" is odd";
            }
        }
        return result;
    }
}
