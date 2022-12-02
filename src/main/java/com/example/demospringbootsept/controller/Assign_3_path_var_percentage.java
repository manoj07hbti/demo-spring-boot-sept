package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_3_path_var_percentage {
    @RequestMapping("/percent/{sub1}/{sub2}/{sub3}/{sub4}/{sub5}")
    public String percent(@PathVariable int sub1,@PathVariable int sub2,@PathVariable int sub3,@PathVariable int sub4,@PathVariable int sub5) {
        String result="The percentage of the student is: ";
        double total = (sub1 + sub2 + sub3 + sub4 + sub5);
        int max = 100*5;
        double percent = (total*100)/max;
        result = result+percent;
        return result;
    }
}
