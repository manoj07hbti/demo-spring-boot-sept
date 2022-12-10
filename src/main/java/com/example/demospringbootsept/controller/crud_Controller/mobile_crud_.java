package com.example.demospringbootsept.controller.crud_Controller;

import com.example.demospringbootsept.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class mobile_crud_ {
              //todo post:add data
    ArrayList<Mobile> mobileArrayList= new ArrayList<>();
    @RequestMapping(value = "/add_details",method = RequestMethod.POST)
    public Mobile keyHighlight(@RequestBody Mobile details){
        mobileArrayList.add(details);
        return details;
    }

               //todo get:read data
    @RequestMapping(value = "/get_details", method = RequestMethod.GET)
    public ArrayList<Mobile> getMobileArrayList() {
        return mobileArrayList;
    }


                //todo update:put and correction data in future
    @RequestMapping(value = "/update_details/{index}/{primaryCamera}",method = RequestMethod.PUT)
    public String updateMobile(@PathVariable int index, @PathVariable String primaryCamera){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setPrimaryCamera(primaryCamera);
        return "change mobile keys ";
    }
    @RequestMapping("/remove_details")
    public String removeMobile(@RequestParam int index){
        mobileArrayList.remove(index);
        return " remove index";
    }

}
