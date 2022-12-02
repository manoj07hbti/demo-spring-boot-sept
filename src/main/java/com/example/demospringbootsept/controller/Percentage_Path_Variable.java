package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_Path_Variable {
    @RequestMapping("/percent/{math}/{science}/{hindi}/{sst}/{art}")
    public String percent(@PathVariable int math,@PathVariable int science,@PathVariable int hindi,
                          @PathVariable int sst,@PathVariable int art){
        String result="this is student percentage = ";
        double total= math+science+hindi+sst+art;
        double max= 100 *5;
        double percent= (total *100)/max;
        result = result+ percent;
        return result;
    }
}
