package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerWithDB {

    @Autowired
    EngineerService service;

    @PostMapping("/add_eng_db")
    public String addEngineer(@RequestBody Engineer engineer){

        return service.addEng(engineer);
    }

    @GetMapping("/get_all_eng")
    public List<Engineer> getAll(){

        return service.getAllEng();
    }
    @PutMapping("/update-eng_db/{id}/{name}")
    public String updateEng(@PathVariable long id,@PathVariable String name){

        return service.updateEng(id,name);
    }

    @DeleteMapping("/delete_eng_db/{id}")
    public String deleteEng(@PathVariable long id){

        return service.deleteEng(id);
    }

}
