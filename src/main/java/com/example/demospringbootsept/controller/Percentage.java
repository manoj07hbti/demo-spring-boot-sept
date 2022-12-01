package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage {
    @RequestMapping("/percent")
    public String percent(){
        String result="this is student percentage = ";
        int math= 98;
        int science= 78;
        int hindi= 56;
        int sst= 68;
        int art=89;
        double total= math+science+hindi+sst+art;
        double max= 100 *5;
        double percent= (total *100)/max;
        result = result+ percent;
        return result;
    }
}
