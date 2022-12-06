package com.example.demospringbootsept.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddNum_Path {
    @RequestMapping("odd/{n}/{m}")
    public String odd(@PathVariable int n,@PathVariable int m) {
        String result = "print odd number :-";
        for (int i = 1; i <= m; i++) {
            if (i % 2 != 0) {
                result = result + "," + i;
            }
        }
        return result;
    }
}
