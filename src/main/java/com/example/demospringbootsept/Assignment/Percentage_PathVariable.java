package com.example.demospringbootsept.Assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_PathVariable {

        @RequestMapping("/percentage/{marks}/{totalMarks}")
        public String percentage(@PathVariable int  marks, @PathVariable double totalMarks) {

            String output = "  ";

            double percentage = marks * 100 / totalMarks;

            output = " Percentage of marks  : " + percentage;

            return output;

        }

        }
