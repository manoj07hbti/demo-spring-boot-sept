package com.example.demospringbootsept.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate_Percentage {
@RequestMapping("/percentage/{mark}/{totalmark}") //localhost:9090/percentage/
    public String Calculate_Percentage(@PathVariable int mark,@PathVariable int  totalmark){

        String result=" ";

        int percentage= mark *100/ totalmark;
        result="Percentage  --:"+percentage;

        return result;



    }
}
