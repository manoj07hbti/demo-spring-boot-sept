package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class Percentage {
        @RequestMapping("/percentage")
        public String percent(){
            String result="Student's Percent : ";
            int Math= 67;
            int Science= 76;
            int Computer= 92;
            int English= 95;
            int Reasoning=78;
            double total= Math+Science+Computer+English+Reasoning;
            double max= 100 *5;
            double percent= (double) (total *100)/max;
            result = result+ percent;
            return result;
        }
}
