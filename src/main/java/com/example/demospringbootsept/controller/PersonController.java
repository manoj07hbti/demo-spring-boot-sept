package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Person;
import com.example.demospringbootsept.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @PostMapping("/add_person_data")
    public String addPer(@RequestBody Person person){

        return service.add(person);

    }
    @GetMapping("/get_per_data")
    public List<Person> getAllPer(){

        return service.getAll();
    }
    @PutMapping("/update_person_data/{id}/{name}")
    public String updatePer(@PathVariable long id,@PathVariable String name){
        return service.update(id,name);
    }
    @DeleteMapping("/delete_person_data/{id} ")
    public String delete(@PathVariable long id){

        return service.delete(id);

    }
}
