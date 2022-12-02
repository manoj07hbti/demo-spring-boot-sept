package com.example.demospringbootsept.path_variable_assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_number_with_path_variable {

    @RequestMapping("/odd_even_number/{number}")

    public String printoddnum(@PathVariable int number) {

        String output="  ";

        if(number % 2==0){

            output=number+ "----------Even_number";

        }
        else {

            output=number+ "------------Odd_numver";
        }

        return output;
    }
}
