package com.example.demospringbootsept.controller.crudc_controller;

import model.Doctor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Doctor_With_Crud {

    ArrayList<Doctor> doctorArrayList= new ArrayList<>();
    @RequestMapping("/add_doctor")
    public Doctor addEmployee(@RequestBody Doctor doctor){
        doctorArrayList.add(doctor);
        return doctor;
    }
    @RequestMapping("/get_doctor_crud")
    public  ArrayList<Doctor> getdoctorArrayList(){
        return doctorArrayList;
    }
}
