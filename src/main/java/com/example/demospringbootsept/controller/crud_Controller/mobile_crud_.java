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

    @RequestMapping(value = "/update_details",method = RequestMethod.PUT)
    public String updateMobile(@RequestParam int index, @RequestParam String name){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setName(name);
        return "change name keys ";
    }
    @RequestMapping(value = "/update_details/{index}/{processor}",method = RequestMethod.PUT)
    public String updateMobile1(@PathVariable int index, @PathVariable String processor){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setProcessor(processor);
        return "change processor keys ";
    }
    @RequestMapping(value = "/update_details/{index}/{primaryCamera}",method = RequestMethod.PUT)
    public String updateMobile2(@PathVariable int index, @PathVariable String primaryCamera){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setPrimaryCamera(primaryCamera);
        return "change primary camera key ";
    }

    @RequestMapping(value = "/update_details/{index}/{network}",method = RequestMethod.PUT)
    public String updateMobile3(@PathVariable int index, @PathVariable String network){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setName(network);
        return "change network key ";
    }
    @RequestMapping(value = "/update_details/{index}/{price}",method = RequestMethod.PUT)
    public String updateMobile4(@PathVariable int index, @PathVariable int price){
        Mobile mobile=mobileArrayList.get(index);
        mobile.setPrice(price);
        return "change price key ";
    }

    @RequestMapping("/remove_details")
    public String removeMobile(@RequestParam int index){
        mobileArrayList.remove(index);
        return " remove index";
    }

}
