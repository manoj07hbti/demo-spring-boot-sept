package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_employee {

    @RequestMapping("/employee1")
    public Employee employee1Info(){
        Employee obj=new Employee("Ravi:",25,"It:","kanpur");

        return obj;


    }
    @RequestMapping("/employee2")
    public Employee employee2Info(){
        Employee obj=new Employee("Raj:",29,"Cs:","Goa");


        return obj;

    }

    @RequestMapping("/employee3")
    public Employee employee3Info(){
        Employee obj= new Employee("Deepak:",29,"It:","Agar");

        return obj;
    }
}
