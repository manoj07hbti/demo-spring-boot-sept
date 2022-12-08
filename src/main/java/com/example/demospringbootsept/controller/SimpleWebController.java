package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController


public class SimpleWebController {
    @RequestMapping("/ss")
    public String greetings(){
        return "<h1> Spring Boot Rocks in Java too!</h1>";
    }

    public User getUserInfo(){

        User obj = new User(01245L,"shivendra", "01shiv","Shiv@gmail.com");
        return obj;

    }
    @RequestMapping("/all_users")
    public ArrayList <User> getUserList(){
        ArrayList <User> users = new ArrayList<>();
     User user1 = new User(0124L,"Kaushalendra", "05giri", "Giri123@gmail.com");
        User user2 = new User(6635L,"shailendra", "06shailu", "shailu@gmail.com");
        User user3 = new User(4582L,"kaushik", "236kaushik", "kaushik@gmail.com");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}

