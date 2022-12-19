package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Medicines;
import com.example.demospringbootsept.service.Medicine_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Medicine_Controller {

    @Autowired
    Medicine_Service service;


    @PostMapping("/add_medicine")
    public String add(@RequestBody Medicines mdcn){
        return service.add(mdcn);
    }

    @GetMapping("/get_medicine")
    public List<Medicines> get(){
        return service.get();
    }
    @PutMapping("/update_medicine/{md_number}/{price}")
    public String update(@PathVariable int md_number,@PathVariable double price){
        return service.update(md_number,price);
    }

    @DeleteMapping("/dlt_medicine/{md_number}")
    public String delete(@PathVariable int md_number){
        return service.delete(md_number);
    }


}
