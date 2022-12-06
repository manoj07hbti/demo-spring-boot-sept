package com.example.demospringbootsept.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Voting_Controller {
    @RequestMapping("/voting")
    public String voting() {
        String result;
        String city = "AGRA";
        int age = 17;
        if (city == "AGRA" && age >= 18) {
            return result = "person is eligible for voting";
        } else {
            result = "person is not eligible for voting";

        }
        return result;}}

