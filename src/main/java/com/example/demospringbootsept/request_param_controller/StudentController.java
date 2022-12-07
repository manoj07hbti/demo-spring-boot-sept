package com.example.demospringbootsept.request_param_controller;

import com.example.demospringbootsept.model1.Student1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    ArrayList <Student1> studentList=new ArrayList<>();
    @RequestMapping("/student_information")
    public Student1 studentinfo(@RequestParam String name,@RequestParam int rollno,@RequestParam int age,@RequestParam String section){
        Student1 info=new Student1(name,rollno,age,section);
        studentList.add(info);
        return info;
    }
    @RequestMapping("/list_student")
    public ArrayList <Student1> getstudentList(){
        return studentList;
    }
}
