package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Doctor;
import com.example.demospringbootsept.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public String add(Doctor doctor){
        repository.save(doctor);
        return "Data saved toDB Successfully";
    }

    public List<Doctor> getAllDoc(){
     return  repository.findAll();
    }

    public String update(Long id, String name){
        Doctor doctor=repository.getById(id);

        doctor.setName(name);
        repository.save(doctor);
        return "Record Successfully updated wit modified name: "+name;
    }

    public String delete(Long id){
        repository.deleteById(id);
        return "Record Successfully Deleted";
    }
}
