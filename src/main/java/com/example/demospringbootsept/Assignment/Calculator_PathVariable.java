package com.example.demospringbootsept.Assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_PathVariable {

    //create method
        @RequestMapping("/addition/{a}/{b}/{c}")
        public String addition(@PathVariable int a, @PathVariable int b,@PathVariable int c) {

            String msg = " ";
            int sum = a+b+c;
            msg = "Addition is : " + sum;
            return msg;
        }
        @RequestMapping("/sub/{a}/{b}/{c}")
        public String subtraction(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
            String msg = " ";
            int sub = a-b-c;
            msg = "Subtraction is : " + sub;
            return msg;
        }

        @RequestMapping("/multi/{a}/{b}/{c}")
        public String multi(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
            String msg = " ";
            int multi = a*b*c;
            msg = "Multiplication is : " + multi;
            return msg;
        }

        @RequestMapping("/divide/{a}/{b}/{c}")
        public String Division(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
            String msg = " ";
            int divide = a/b/c;
            msg = "Division is : " + divide;
            return msg;
        }



    }

