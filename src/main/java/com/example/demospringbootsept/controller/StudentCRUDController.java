package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCRUDController {


    ArrayList <Student> studentArrayList= new ArrayList<>();
    //CRUD
    //1.C : CREATE /INSERT  ---> POST

    @RequestMapping(value = "/add_student",method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student){

        studentArrayList.add(student);

        return student;
    }

    @RequestMapping(value = "/get_students", method = RequestMethod.GET)
    public ArrayList<Student> getData(){

        return studentArrayList;
    }


    @RequestMapping(value = "/update_student/{index}/{name}", method = RequestMethod.PUT)
    public String updateStudent(@PathVariable int index,@PathVariable String name){

       Student student= studentArrayList.get(index);
       student.setName(name);

      return "Name Updated Successfully..";
    }



    @RequestMapping(value = "/remove_student", method = RequestMethod.DELETE)
    public String removeStudent(@RequestParam int index){

        studentArrayList.remove(index);

        return "Student deleted successfully...";
    }


}
