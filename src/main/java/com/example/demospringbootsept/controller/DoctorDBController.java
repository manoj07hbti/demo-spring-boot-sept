package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Doctor;
import com.example.demospringbootsept.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorService service;

    @PostMapping("/add_doctor")
    public String addDoctor(@RequestBody Doctor doctor){
        return service.add(doctor);
    }

    @GetMapping("/get_all_doc")
    public List<Doctor> getAllDoc(){
        return service.getAllDoc();
    }

    @PutMapping("/update_doc/{id}/{name}")
    public String update(@PathVariable Long id,@PathVariable String name){
        return service.update(id, name);
    }

    @DeleteMapping("/delete_doc/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }
}
