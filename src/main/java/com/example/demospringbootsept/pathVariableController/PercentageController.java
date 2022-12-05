package com.example.demospringbootsept.pathVariableController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {

    @RequestMapping("/percentage/{number}/{totalNumber}")
    public String percentage(@PathVariable double number,@PathVariable double totalNumber){

        String value="  ";

        double percentage= number*100/totalNumber;
        value=" Percentage of marks  :" +percentage;
        return value;
    }
}
