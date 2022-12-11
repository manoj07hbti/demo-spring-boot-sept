package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Assign_6_mobile_CRUD {
    ArrayList<Mobile> mobileArrayList = new ArrayList<>();

    @RequestMapping(value = "/add_mobile", method = RequestMethod.POST)
    public String addMobile(@RequestBody Mobile mobile) {
        mobileArrayList.add(mobile);
        return "device details has been added";
    }
    @RequestMapping(value="/update_mobile/{index}", method = RequestMethod.PUT)
    public String updateMobile(@PathVariable  int index,@RequestBody Mobile mobile){
        mobileArrayList.remove(index);
        mobileArrayList.add(index,mobile);
        return "mobile details at index "+index+" has been updated";
    }
    @RequestMapping(value="/get_mobile_data", method = RequestMethod.GET)
    public ArrayList<Mobile> mobileData()  {
        return mobileArrayList;
    }

    @RequestMapping(value="update_brand", method = RequestMethod.PUT)
    public String updateBrand(@RequestParam int index ,@RequestParam String brand){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setBrand(brand);
        return "mobile brand name has been updated";
    }
    @RequestMapping(value="update_model", method = RequestMethod.PUT)
    public String updateModel(@RequestParam int index ,@RequestParam String model){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setModel(model);
        return "mobile model name has been updated";
    }
    @RequestMapping(value="update_ram", method = RequestMethod.PUT)
    public String updateRam(@RequestParam int index ,@RequestParam int ram){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setRam(ram);
        return "mobile ram has been updated";
    }
    @RequestMapping(value="update_storage", method = RequestMethod.PUT)
    public String updateStorage(@RequestParam int index ,@RequestParam int storage){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setStorage(storage);
        return "mobile storage has been updated";
    }
    @RequestMapping(value="/delete_mobile", method = RequestMethod.DELETE)
    public String delete(int index){
        mobileArrayList.remove(index);
        return "mobile data has been deleted";
    }



}

