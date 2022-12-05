
    package com.example.demospringbootsept.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DemoCalc {
        @RequestMapping("/add")
        public int add(){
            int a=50;
            int b=40;
            return a+b;
        }
        @RequestMapping("/sub")
        public int sub(){
            int a=50;
            int b=40;
            return a-b;}
        @RequestMapping("/multiply")
        public int multiply(){
            int a=50;
            int b=40;
            return a*b;}
        @RequestMapping("/div")
        public int div(){
            int a=50;
            int b=40;
            return a*b;}
}
