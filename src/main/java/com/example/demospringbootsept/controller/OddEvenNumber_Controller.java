package com.example.demospringbootsept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenNumber_Controller {

    @RequestMapping("/even_number")
    public String printEven(){

        String result="Even number between 1 to 100 Are: ";
        for(int i=1; i<=100; i++){

            if(i%2==0){

                result= result + " ,  " +i;
            }
        }

        return result;
    }

    @RequestMapping("/odd_number")
    public String printOdd(){

        String result = " ODD NUMBER BETWEEN 1 TO 100 ARE : ";
        for(int i= 1; i<=100; i++) {

            if (i % 2 != 0) {

                result = result + "  ,  " + i;

            }
        }

        return  result;

            }

        }


