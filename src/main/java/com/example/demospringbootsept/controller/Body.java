package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Body {

    ArrayList<Student> list=new ArrayList<>();
    @RequestMapping(value= "/student_data", method = RequestMethod.POST)
    public Student create(@RequestBody Student std){
        list.add(std);
        return std;
    }
    @RequestMapping(value = "/getting_info", method = RequestMethod.GET)
    public ArrayList<Student> getting(){
        return list;
    }
    @RequestMapping(value = "/updating_students/{index}/{name}", method = RequestMethod.PUT)
    public String update_student(@PathVariable int index, @PathVariable String name){
        Student obj=list.get(index);
        obj.setName(name);
        return "name is successfully updated";
    }
    @RequestMapping(value = "/deleting_student",method = RequestMethod.DELETE)
    public String dltStudent(@RequestParam int index){
        list.remove(index);
        return "delete ho gya sutdent";
    }


}
