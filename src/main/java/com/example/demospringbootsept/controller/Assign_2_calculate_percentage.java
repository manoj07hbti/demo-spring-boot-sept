package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign_2_calculate_percentage {

    @RequestMapping("/percent")
public String percent() {
        String result="The percentage of the student is: ";
        int marksSub1 = 87;
        int marksSub2 = 75;
        int marksSub3 = 78;
        int marksSub4 = 97;
        int marksSub5 = 76;
        double total = (marksSub1 + marksSub2 + marksSub3 + marksSub4 + marksSub5);
        int max = 100*5;
        Double percent = (total*100)/max;
        result = result+percent;
       return result;
    }
}