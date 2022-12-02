package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_Voting_Controller {


    @RequestMapping("/voting/{city}/{age}")
    public String eligibility(@PathVariable String city, @PathVariable int age) {

        String message = "  ";

        if (city.equals("Agra") && age >= 18) {

            message = "eligible for voting";

        } else {
            message = "not eligible for voting";

        }

        return message;

    }
}
