package com.example.demospringbootsept.controller.crud_Controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Student_Crud {

    ArrayList<Student> studentArrayList= new ArrayList<>();

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student std){
       studentArrayList.add(std);
       return std;
    }
    @RequestMapping(value = "/get_student", method = RequestMethod.GET)
    public ArrayList<Student> getStudent(Student e) {
        return studentArrayList;
    }

    @RequestMapping(value = "/update_student/{index}/{name}", method = RequestMethod.PUT)
    public String updateStudent(@PathVariable int index,@PathVariable String name){
        Student std = studentArrayList.get(index);
        std.setName(name);
        return "name update successful";
    }

    @RequestMapping(value = "/remove_student", method = RequestMethod.DELETE)
    public String removeStudent(@RequestParam int index){
        studentArrayList.remove(index);
        return "remove index";
    }
}
