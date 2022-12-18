package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerController {

    @Autowired
    EngineerService service;

    @PostMapping("/add_eng_data")
    public String addEng(@RequestBody Engineer engineer){

        return service.add(engineer);
    }

    @GetMapping("/get_eng_data")
    public List<Engineer> getAll(){
        return service.getAllEng();
    }

    @PutMapping("/update_eng_data/{id}/{name}")
    public String update(@PathVariable long id,@PathVariable String name){

        return service.update(id,name);
    }

    @DeleteMapping("/delete_eng_data/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
