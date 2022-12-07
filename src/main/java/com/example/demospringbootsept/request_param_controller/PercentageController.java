package com.example.demospringbootsept.request_param_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {
    @RequestMapping("/percentile")
    public String Percent(@RequestParam int marks,@RequestParam int totalMarks){
        float percentage=(float)marks*100/totalMarks;
        String result="the percentage got by the student"+percentage;
        return result;

    }
}
