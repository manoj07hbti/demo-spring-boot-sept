package com.example.demospringbootsept.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_path_variable {

    //todo syntax:@requestMapping("/endpoint_name/{variable})

    @RequestMapping("/odd/{num}")
    public String odd(@PathVariable int num) {
        String result = "";
        if (num % 2 != 0) {
                result = num + "is  odd number";
            } else {
                result = num + " is not odd number";
            }
        return result;
    }
}
