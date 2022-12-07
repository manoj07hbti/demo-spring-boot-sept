package com.example.demospringbootsept.path_variable_controller1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class voting_Eligible_controller {
    public class Voting_Controller1 {
        @RequestMapping("/voting/{city}/{age}")
        public String voting(@PathVariable String city, @PathVariable int age) {
            String obj = ",";
            if (city.equals("AGRA") && age >= 18) {
                obj = "person is eligible for voting in " + city + "at the age of " + age;
            } else {
                obj = "person is not eligible for voting in " + city + "at the age of " + age;
            }
            return obj;
        }
    }
}


