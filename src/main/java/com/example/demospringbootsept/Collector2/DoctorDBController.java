package com.example.demospringbootsept.Collector2;

import com.example.demospringbootsept.Service.DoctorDBService;
import com.example.demospringbootsept.model1.Doctor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {
    @Autowired
    DoctorDBService service;
    @PostMapping("/patient_add")
    public String add(@RequestBody Doctor1 doctor){
        return service.add(doctor);

    }
    @GetMapping("/patient_get")
    public List<Doctor1> get(){
        return service.get();
    }
    @PutMapping("/patient_update")
    public String update(@RequestParam int serial_no,@RequestParam int age){
        return service.update(serial_no,age);
    }
    @DeleteMapping("/patient_remove")
    public String remove(@RequestParam int serial_no){
        return service.remove(serial_no);
    }
}
