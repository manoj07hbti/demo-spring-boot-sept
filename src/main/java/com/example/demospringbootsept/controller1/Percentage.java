package com.example.demospringbootsept.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage {
    @RequestMapping("/percentage")
    public String perncite(){
        String result="Find the 10 percent of 200 is -: ";
        int percent=10;
        int number=200;
        int solve=(number/100)*percent;
        return result=result+" "+solve;
    }
    @RequestMapping("/percent_double")
    public String percentile(){
        String result="Find the 10 percent of 200 is -: ";
        int marks=30;
        int totalMarks=700;
        float solve=(float)marks*100/totalMarks;
        return result=result+" "+solve                     ;
    }
}
