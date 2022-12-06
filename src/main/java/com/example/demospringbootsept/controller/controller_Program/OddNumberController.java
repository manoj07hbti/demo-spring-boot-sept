package com.example.demospringbootsept.controller.controller_Program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddNumberController {
    @RequestMapping("/odd")
    public String odd() {
        String result = "print odd number :-";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                result = result + "," + i;
            }
        }
        return result;
    }
}
