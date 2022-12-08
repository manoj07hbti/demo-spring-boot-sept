package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping
public class UserCRUDController {
    ArrayList <User> userArrayList = new ArrayList<>();
    @RequestMapping("/add_user")
    public User adduser(@RequestBody User user){
        userArrayList.add(user);
        return user;
    }

    @RequestMapping("/get_users")
    public ArrayList<User> getData(){
        return userArrayList;
    }

    @RequestMapping("/update_user/(index)/{name}, method= RequestMethod.PUT")
    public String updateUser (@PathVariable int index, @PathVariable String name){
        User user = userArrayList.get(index);
        user.setUserName(name);
        return "Name update Successfully...";
    }

}

