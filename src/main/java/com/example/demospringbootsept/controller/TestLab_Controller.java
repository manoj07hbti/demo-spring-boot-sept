package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.TestLab;
import com.example.demospringbootsept.service.TestLab_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestLab_Controller {

    @Autowired
    TestLab_Service service;

    @PostMapping("/add_lab")
    public String add(@RequestBody TestLab lab) {
        return service.add(lab);
    }

    @GetMapping("/get_lab")
    public List<TestLab> get() {
        return service.get();
    }

    @PutMapping("/put_lab")
    public String put(@RequestParam long id, @RequestParam String name, @RequestParam String city) {
        return service.put(id, name, city);
    }

    @DeleteMapping("/delete_lab/{id}")
    public String delete(@PathVariable long id) {
        return service.delete(id);
    }

    @GetMapping("/find_lab")
    public TestLab getTestlab(@RequestParam long id) {
        return service.findById(id);
    }

    @GetMapping("/find_city")
    public TestLab getCity(@RequestParam String city) {
        return service.findByCity(city);
    }

    @GetMapping("/find_name")
    public TestLab getName(@RequestParam String name){
        return service.findByName(name);
    }


}
