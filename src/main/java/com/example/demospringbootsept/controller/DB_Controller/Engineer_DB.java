package com.example.demospringbootsept.controller.DB_Controller;

import com.example.demospringbootsept.model.Engineer_SQL;
import com.example.demospringbootsept.repository.EngineerRepository;
import com.example.demospringbootsept.service.Engineer_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Engineer_DB {
    @Autowired
    Engineer_service service;
    @Autowired
    private EngineerRepository engineerRepository;

    //CRUD // create
    @PostMapping("/addEngineer_DB")
    public String addEngineer(@RequestBody Engineer_SQL engineerSql){
        return service.add(engineerSql);
    }

    //get
    @GetMapping("/getEngineer_DB")
    public List<Engineer_SQL> getAll(){
        return service.getAlleng();
    }
    //update
    @PutMapping("/updateEngineer_DB/{id}/{name}")
    public String updateEngineer(@PathVariable long id,@PathVariable String name){
        return service.update(id,name);
    }
    @PutMapping("/updateEngineer1_DB/{id}/{post}")
    public String updateEngineer1( @PathVariable long id,@PathVariable String post){
        return service.update1(id, post);
    }
    @PutMapping("/updateEngineer2_DB/{id}/{posting}")
    public String updateEngineer2( @PathVariable long id,@PathVariable String posting){
        return service.update2(id, posting);
    }
    @PutMapping("/updateEngineer3_DB/{id}/{salary}")
    public String updateEngineer3( @PathVariable long id,@PathVariable String salary){
        return service.update3(id, salary);
    }
    //delete
    @DeleteMapping("/deleteEngineer_DB/{id}")
    public String deleteEngineer(@PathVariable long id){
        return service.delete(id);
    }
}
