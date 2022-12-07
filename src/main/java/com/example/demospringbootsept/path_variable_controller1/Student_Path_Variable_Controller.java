package com.example.demospringbootsept.path_variable_controller1;

import com.example.demospringbootsept.model1.Student1;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Student_Path_Variable_Controller {
    ArrayList<Student1> students = new ArrayList<>();

    @RequestMapping("/detail/{name}/{rollno}/{age}/{section}")
    public Student1 detail(@PathVariable String name, @PathVariable int rollno, @PathVariable int age, @PathVariable String section) {
        Student1 std1 = new Student1(name, rollno, age, section);
        students.add(std1);
        return std1;

    }
    @RequestMapping("/list")
    public ArrayList<Student1>get(){
        return students;
    }
}
