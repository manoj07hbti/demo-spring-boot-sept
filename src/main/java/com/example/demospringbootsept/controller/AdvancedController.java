package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdvancedController {


    @RequestMapping("/even_number")
    public String printEven(){

        String result="Even number between 1 to 50 Are: ";
        for(int i=1; i<=50; i++){

            if(i%2==0){

             result= result + " , " +i;
            }
        }

        return result;
    }

    @RequestMapping("/student")
    public Student getStudentInfo(){

        Student obj = new Student("Raj",21,1,"CS");

        return obj;
    }


    @RequestMapping("/all_students")
    public ArrayList<Student> getStudentList(){

        ArrayList <Student> students= new ArrayList<>();
        Student student1 = new Student("Raj",21,1,"CS");
        Student student2 = new Student("Rahul",21,2,"IT");
        Student student3 = new Student("Mukesh",21,3,"CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

}
