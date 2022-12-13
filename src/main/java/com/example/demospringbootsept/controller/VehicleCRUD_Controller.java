package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Vehicles;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class VehicleCRUD_Controller {


    ArrayList<Vehicles> vehiclesArrayList = new ArrayList<>();

    @RequestMapping(value = "/add_vehicles", method = RequestMethod.POST)
    public Vehicles add_vehicles(@RequestParam String company, @RequestParam String model, @RequestParam int price) {

        Vehicles vehicle1 = new Vehicles(company, model, price);

        vehiclesArrayList.add(vehicle1);

        return vehicle1;
    }

    @RequestMapping(value = "/get_vehicles", method = RequestMethod.GET)
    public ArrayList<Vehicles> getInfo_vehicles() {

        return vehiclesArrayList;
    }

    @RequestMapping(value = "/update_vehicles/{index}/{model}", method = RequestMethod.PUT)
    public String update_vehicles(@PathVariable int index, @PathVariable String model) {

        Vehicles vehicles = vehiclesArrayList.get(index);
        vehicles.setModel(model);

        return "  Model Updated Successfully.....";
    }


    @RequestMapping(value = "/remove_Vehicles", method = RequestMethod.DELETE)
    public String remove_vehicles(@RequestParam int index) {

        vehiclesArrayList.remove(index);

        return "Vehicles deleted successfully...";
    }


}
