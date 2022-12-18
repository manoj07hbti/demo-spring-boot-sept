package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Doctor;
import com.example.demospringbootsept.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService service;

    @PostMapping("/add_doctor")
    public String addDoc(@RequestBody Doctor doctor){
        return service.add(doctor);

    }
    @GetMapping("/get_Doctor")
    public List<Doctor> getDoc(){
        return service.getAllDoc();
    }
    @PutMapping("/update_doctor/{id}/{name}")
    public String updateDoc(@PathVariable long id, @PathVariable String name){
        return service.update(id, name);
    }
    @DeleteMapping("/delete_doctor/{id}")
    public String deleteDoc(@PathVariable long id){
        return service.delete(id);

    }
}
