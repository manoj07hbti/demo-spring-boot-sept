package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import com.example.demospringbootsept.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;


    //CRUD
    //CREATE
    @PostMapping("/add_std_db")
    public String addStudent(@RequestBody Student student){

        return service.add(student);

    }

    //READ
    @GetMapping("/get_all_std")
    public List<Student> getAll(){

      return   service.getAllStd();
    }

    //UPDATE

    @PutMapping("/update_std_db/{roll_no}/{name}")
    public String update(@PathVariable long roll_no,@PathVariable String name){

        return service.update(roll_no,name);

    }

    //Delte

    @DeleteMapping("/delete_std_db/{roll_no}")
    public String delete(@PathVariable long roll_no){

        return service.delete(roll_no);
    }

}
