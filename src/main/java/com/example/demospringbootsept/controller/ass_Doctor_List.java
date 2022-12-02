package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ass_Doctor_List {

    @RequestMapping("/doctorList/{name}/{age}/{specialist}")
    public Doctor doctor(@PathVariable String name, @PathVariable int age,@PathVariable String specialist){

        Doctor doctor=new Doctor(name,age,specialist);

        return doctor;


    }
}
