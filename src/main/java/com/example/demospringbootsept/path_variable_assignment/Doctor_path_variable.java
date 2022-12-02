package com.example.demospringbootsept.path_variable_assignment;

import com.example.demospringbootsept.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Doctor_path_variable {

    @RequestMapping("/doctor/{age}/{name}/{dept}/{number}")
    public Doctor doctorinfo(@PathVariable int age, @PathVariable String name, @PathVariable String dept, @PathVariable int number){

        Doctor doctor=new Doctor(age,name,dept,number);


        return doctor;

    }


}
