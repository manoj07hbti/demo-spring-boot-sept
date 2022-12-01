package com.example.demospringbootsept.assignment_neeraj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage {

    // create method
    @RequestMapping("/percent")
    public String percent() {
        String result="The percentage of the student is: ";
        int marks1 = 90;
        int marks2 = 54;
        int marks3 = 44;
        int marks4 = 47;
        int marks5 = 77;
        double total = (marks1 + marks2 + marks3 + marks4 + marks5);
        int max = 100*5;
        Double percent = (total*100)/max;
        result = result+percent;
        return result;
    }


}
