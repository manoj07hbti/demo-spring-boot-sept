package com.example.demospringbootsept.controller.crud_Controller;

import com.example.demospringbootsept.model.vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class vehicle_crud {

    ArrayList<vehicle> vehicleArrayList = new ArrayList<>();
    @RequestMapping(value = "/add_vehicle", method = RequestMethod.POST)
    public vehicle addVehicles(@RequestBody vehicle veh){
        vehicleArrayList.add(veh);
        return veh;
    }
    @RequestMapping(value = "/get_vehicle", method =RequestMethod.GET)
    public ArrayList<vehicle> getVehicleArrayList() {
        return vehicleArrayList;
    }


    @RequestMapping(value = "/update1_vehicle/{index}/{name}", method = RequestMethod.PUT)
    public String updateVehicle1(@PathVariable int index,@PathVariable String name){
        vehicle veh1 = vehicleArrayList.get(index);
        veh1.setName(name);
        return "change name";
    }

    @RequestMapping(value = "/update2_vehicle/{index}/{engineCapacity}", method = RequestMethod.PUT)
    public String updateVehicle2(@PathVariable int index,@PathVariable String engineCapacity){
        vehicle veh2 = vehicleArrayList.get(index);
        veh2.setEngineCapacity(engineCapacity);
        return "change engine capacity";
    }

    @RequestMapping(value = "/update3_vehicle/{index}/{mileage}", method = RequestMethod.PUT)
    public String updateVehicle3(@PathVariable int index,@PathVariable String mileage){
        vehicle veh3 = vehicleArrayList.get(index);
        veh3.setMileage(mileage);
        return "change mileage";
    }

    @RequestMapping(value = "/update4_vehicle/{index}/{kerbWeight}", method = RequestMethod.PUT)
    public String updateVehicle4(@PathVariable int index,@PathVariable String kerbWeight){
        vehicle veh4 = vehicleArrayList.get(index);
        veh4.setKerbWeight(kerbWeight);
        return "change kerb weight";
    }

    @RequestMapping(value = "/remove_vehicle/{index}",method = RequestMethod.DELETE)
    public String removeVehicle(@PathVariable int index){
        vehicleArrayList.remove(index);
        return "remove the index";
    }
}
