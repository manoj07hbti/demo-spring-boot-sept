package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_Controller {

    @RequestMapping("/percentage")
    public float percentage(){

        System.out.println("CALCULATING PERCENTAGE");
        float marks=466, totalMarks=600, percentage;

        percentage = marks*100/totalMarks;

        return percentage;
    }
}
