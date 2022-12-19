package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.service.Service_Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.util.List;

@RestController
public class Engineer_Controller {

   @Autowired
   Service_Engineer service;

    @PostMapping("/aadd_")
    public String add_engineer(@RequestBody Engineer eng) {
        return  service.add(eng);// service.add() is the method name of service engineer layer
    }

    @GetMapping("/get_eng")
    public List<Engineer> get_eng(){
        return service.get();// service.get() is the method name of service engineer layer
    }

    @PutMapping("/put_eng/{id}/{name}")
    public String update(@PathVariable int id, @PathVariable String name){
        return service.update(id,name);
    }

    @DeleteMapping("/dlt_eng/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
