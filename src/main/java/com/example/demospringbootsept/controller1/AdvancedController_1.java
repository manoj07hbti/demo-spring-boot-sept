package com.example.demospringbootsept.controller1;

import com.example.demospringbootsept.model1.Student1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdvancedController_1 {
    @RequestMapping("/student_detail")
    public Student1 studentInfo() {
        Student1 obj = new Student1("Vishal", 2, 24, "EE");
        return obj;
    }
   @RequestMapping("/all_student")
    public ArrayList<Student1> getStudentInfo(){
        ArrayList<Student1> students=new ArrayList<>();
        Student1 student1=new Student1("Vishal",4,24,"EE");
       Student1 student2=new Student1("Akash",7,23,"IT");
       Student1 student3=new Student1("Vimal",5,26,"EC");
       students.add(student1);
       students.add(student2);
       students.add(student3);
       return students;
   }
}



