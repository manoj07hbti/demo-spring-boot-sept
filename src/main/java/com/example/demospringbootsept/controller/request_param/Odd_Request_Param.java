package com.example.demospringbootsept.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Odd_Request_Param {
    @RequestMapping("oddNum")
    public String odd(@RequestParam int n, @RequestParam int m) {
        String result = "print odd number :-";
        for (int i = 1; i <= m; i++) {
            if (i % 2 != 0) {
                result = result + "," + i;
            }
        }
        return result;
    }
}
