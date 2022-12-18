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
        return "Doctor data save into database";
    }

    public List<Doctor> getAllDoc(){
        return repository.findAll();
    }

    public String update(long id,String name){
        Doctor doctor=repository.getReferenceById(id);
        doctor.setName(name);
         repository.save(doctor);

         return "Doctor record updated successfully";

    }

    public String delete(long id){
        repository.deleteById(id);
        return "Doctor data delete successfully";
    }
}
