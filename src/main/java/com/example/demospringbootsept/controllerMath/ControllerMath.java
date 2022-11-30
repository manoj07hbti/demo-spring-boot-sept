package com.example.demospringbootsept.controllerMath;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMath {


    @RequestMapping("/add")
    public int add(){

        int a=12;
        int b=13;
        return a+b;
    }
    @RequestMapping("/sub")
    public int sub(){
        int a=35;
        int b=12;
        return a-b;
    }

    @RequestMapping("/multiple")
    public int mul(){
        int a=35;
        int b=12;
        return a*b;
    }

    @RequestMapping("/divide")
    public int divide(){
        int a=35;
        int b=5;
        return a/b;
    }

}
