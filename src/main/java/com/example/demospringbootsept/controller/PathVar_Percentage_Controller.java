package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_Percentage_Controller {


    @RequestMapping("/percentage/{marks}/{totalMarks}")
    public String percentage(@PathVariable float marks, @PathVariable float totalMarks) {

        String output = "  ";

        float percentage = marks * 100 / totalMarks;

        output = " Percentage of marks  : " + percentage;

        return output;

    }


}
