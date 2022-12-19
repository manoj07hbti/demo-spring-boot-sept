package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import com.example.demospringbootsept.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbController {
@Autowired
    StudentService service;

    //CRUD

    //C ==> Create
@PostMapping("/add_std_db")
    public String addStudent(@RequestBody Student student){

    return service.add(student);

    }

    //R ==> Read

    @GetMapping("/get_allStudent")
    public List<Student> getAll(){
        return service.getAllStd();

    }

    //U ==> Update

    @PutMapping("/update_student_db/{rollNo}/{name}")
    public String update(@PathVariable long rollNo ,@PathVariable String name){
        return service.update(rollNo, name);
    }


    //D ==> Delete
    @DeleteMapping("/delete_student_db/{rollNo}")
    public String delete(@PathVariable int rollNo){
        return service.delete(rollNo);
    }
}
