package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVariableController {

//SYNTAX : @RequestMapping("/endpoint_name/{variable_name}")

    ArrayList <Student> students= new ArrayList<>();

    @RequestMapping("/check_number/{number}")
    public String checkEvenOdd(@PathVariable int number ){
        String msg="";

        if(number%2 ==0){

            msg=number+" Number is EVEN NUMBER ";
        }
        else {
            msg=number+" Number is ODD NUMBER ";
        }

        return msg;

    }

    @RequestMapping("/voting/{city}/{age}")
    public String checkEligiblity(@PathVariable String city, @PathVariable int age){

        String msg="";

        if(city.equals("AGRA") && age>=18){

            msg= "Person is eligible for voting in Agra...";
        }
        else {
            msg= "Person is NOT eligible for voting in Agra...";
        }

       return msg;
    }


    @RequestMapping("create_student/{name}/{age}/{rollno}/{section}")
    public Student createStudent(@PathVariable String name, @PathVariable int age, @PathVariable int rollno, @PathVariable String section){

        Student student= new Student(name,age, rollno,section);

        students.add(student);

        return student;

    }


    @RequestMapping("/student_list")
    public ArrayList<Student> getStudents(){

        return students;
    }

}
