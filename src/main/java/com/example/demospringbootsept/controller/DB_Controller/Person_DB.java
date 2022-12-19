package com.example.demospringbootsept.controller.DB_Controller;

import com.example.demospringbootsept.model.Person_SQL;
import com.example.demospringbootsept.repository.PersonRepository;
import com.example.demospringbootsept.service.Person_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Person_DB {
    @Autowired
    Person_service service;

    @Autowired
    private PersonRepository personRepository;

    //create
    @PostMapping("/addPerson_DB")
    public String addPerson(@RequestBody Person_SQL personSql){ return service.add(personSql);}

    //get
    @GetMapping("/getPerson_DB")
    public List<Person_SQL> getAll(){
        return service.getAllPer();
    }

    //update
    @PutMapping("/updatePerson_DB/{id}/{name}")
    public String updatePerson(@PathVariable long id,@PathVariable String name){
        return service.update(id, name);
    }

    @PutMapping("/updatePerson1_DB/{id}/{place}")
    public String updatePerson1(@PathVariable long id,@PathVariable String place){
        return service.update1(id, place);
    }
    @PutMapping("/updatePerson2_DB/{id}/{job}")
    public String updatePerson2(@PathVariable long id,@PathVariable String job){
        return service.update2(id, job);
    }
    //delete
    @DeleteMapping("/deletePerson_DB/{id}")
    public String deletePerson(@PathVariable long id){
        return service.delete(id);
    }
}
