package com.example.demospringbootsept.Collector2;

import com.example.demospringbootsept.Service.StudentDBService;
import com.example.demospringbootsept.model1.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {
    @Autowired
    StudentDBService service;
    @PostMapping("/add_std_DB")
    public String std_detail(@RequestBody Student1 student){


        return service.add(student);
    }
    @GetMapping("/get_all_DB")
    public List<Student1>getAll(){
        return service.get();

    }
    @PutMapping("/update_name_DB/{roll_no}/{name}")
        public String update(@PathVariable long roll_no,@PathVariable String name){
        return service.update(roll_no,name);
        }
        @DeleteMapping("/remove_DB/{roll_no}")
    public String remove(@PathVariable long roll_no){
        return service.remove(roll_no);
        }
}
