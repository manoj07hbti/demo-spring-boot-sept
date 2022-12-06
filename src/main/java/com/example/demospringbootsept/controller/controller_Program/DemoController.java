package com.example.demospringbootsept.controller.controller_Program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping("/message")
    public void hello(){

        System.out.println("Hello World...");
    }


    @RequestMapping("/welcome")
    public String welcome(){

        String msg="Welcome to Spring boot ....";

        return msg;
    }

    @RequestMapping("/make_square")
    public int makeSquare(){

        return 3*3;
    }

}
