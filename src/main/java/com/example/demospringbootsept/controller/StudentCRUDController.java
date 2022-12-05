package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCRUDController {


    ArrayList <Student> studentArrayList= new ArrayList<>();
    //CRUD
    //1.C : CREATE /INSERT  ---> POST

    @RequestMapping("/add_student")
    public Student addStudent(@RequestBody Student student){

        studentArrayList.add(student);

        return student;
    }

    @RequestMapping("/get_students")
    public ArrayList<Student> getData(){

        return studentArrayList;
    }


}
