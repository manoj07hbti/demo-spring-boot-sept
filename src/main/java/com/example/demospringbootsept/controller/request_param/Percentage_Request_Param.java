package com.example.demospringbootsept.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_Request_Param {
    @RequestMapping("/percentage")
    public String percent(@RequestParam int math, @RequestParam int science,@RequestParam int hindi,
                          @RequestParam int sst, @RequestParam int art){
        String result="this is student percentage = ";
        double total= math+science+hindi+sst+art;
        double max= 100 *5;
        double percent= (total *100)/max;
        result = result+ percent;
        return result;
    }
}
