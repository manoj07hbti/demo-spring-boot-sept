package com.example.demospringbootsept.Service;

import com.example.demospringbootsept.Repository.DoctorDBRepository;
import com.example.demospringbootsept.model1.Doctor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DoctorDBService {
    @Autowired
    DoctorDBRepository repository;
    public String add(Doctor1 doctor){
        repository.save(doctor);
        return"DAta Added Succesfully";

    }
    public List<Doctor1> get(){

       return repository.findAll();
    }
    public String update(@RequestParam int serial_no,@RequestParam int age){
        Doctor1 doctor=repository.getById(serial_no);
        doctor.setAge(age);
        repository.save(doctor);
        return"age update successfully you are great Vishal baboo";

    }
    public String remove(@RequestParam int serial_no){
        repository.deleteById(serial_no);

        return"Data Delete Successfuly";
    }
}
