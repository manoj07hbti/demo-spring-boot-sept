package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.CacheRequest;
import java.util.ArrayList;

@RestController
public class Automobile_CRUD_Operation {
    ArrayList<Car> getCardetail=new ArrayList<>();
    public Car getName(@RequestBody Car detail){
        getCardetail.add(detail);
        return detail;

    }
    public ArrayList<Car>price(){
        return getCardetail;
    }
}
