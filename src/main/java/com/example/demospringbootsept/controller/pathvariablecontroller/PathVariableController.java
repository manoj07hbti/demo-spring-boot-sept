package com.example.demospringbootsept.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
@RequestMapping("/check_number/{number}")  //localhost:9090/check_number
    public String checkEvenOdd(@PathVariable int number){

        String msg=" ";

        String result;

        if (number%2==0){
            result= number+"This is Even Number";
        }
        else {
            result= number+"This is not  Even Number";
        }
        return result;
    }
}
