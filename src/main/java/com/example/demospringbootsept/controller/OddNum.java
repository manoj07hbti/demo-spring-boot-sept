package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class OddNum {
        @RequestMapping("/odd_num")
        public String Odd() {

            String result = "odd numbers";
            for (int i = 1; i <= 100; i++) {

                if (i % 2 != 0) {

                    result = result + " , " + i;
                }
            }

            return result;
        }
    }

