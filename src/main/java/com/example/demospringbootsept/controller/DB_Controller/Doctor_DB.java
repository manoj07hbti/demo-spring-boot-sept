package com.example.demospringbootsept.controller.DB_Controller;

import com.example.demospringbootsept.model.Doctor_SQL;
import com.example.demospringbootsept.repository.DoctorRepository;
import com.example.demospringbootsept.service.Doctor_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Doctor_DB {

    @Autowired
    Doctor_service service;
    @Autowired
    private DoctorRepository doctorRepository;

    // CRUD
    //create
    @PostMapping("/addDoctor_DB")
    public String add_doctor (@RequestBody Doctor_SQL doctorSql){
        return service.add(doctorSql);
    }

    //get
    @GetMapping("/getDoctor_DB")
    public List<Doctor_SQL> getAll(){
        return service.getAlldoc();
    }

    //update
    @PutMapping("/updateDoctor_DB/{id}/{name}")
    public String update(@PathVariable long id,@PathVariable String name){
        return  service.update(id, name);
    }
    // delete
    @DeleteMapping("/deleteDoctor_DB/{id}")
    public String delete(@PathVariable long id ){
        return service.delete(id);
    }
}
