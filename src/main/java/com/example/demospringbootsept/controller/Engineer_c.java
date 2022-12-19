package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Engineer_m;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demospringbootsept.service.Engineer_s;

import java.util.List;

@RestController
public class Engineer_c {
    @Autowired
   Engineer_s service;

    @PostMapping("/add_engg")
    public String addEng(@RequestBody Engineer_m eng1){
        return service.addEng(eng1);
    }
    @GetMapping("get_engg_data")
    public List<Engineer_m> get_engg_data() {
        return service.get_engg_data();
    }
    @PutMapping("update_engg_name/{id}/{name}")
    public String update_name(@PathVariable int id, @PathVariable String name){
        return service.update_name(id,name);
    }
    @PutMapping("update_engg_dpt/{id}/{dpt}")
    public String update_dpt(@PathVariable int id, @PathVariable String dpt){
        return service.update_dpt(id,dpt);
    }
    @PutMapping("update_engg_salary/{id}/{salary}")
    public String update_name(@PathVariable int id, @PathVariable double salary){
        return service.update_salary(id,salary);
    }

}
