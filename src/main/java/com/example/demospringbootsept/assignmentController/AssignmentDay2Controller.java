package com.example.demospringbootsept.assignmentController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentDay2Controller {
//---------------------Assignment 1- ODD Number--------------------------------------------------
    @RequestMapping("/odd_number")
    public String oddNumber(){

        String result = "Odd number between 1 to 100 are :";

        for (int i = 0; i<=100; i++){

            if(i%2 != 0 ){

                result = result + ", "+ i;

            }
        }
        return result;
    }

    //---------------------Assignment 2- fibonacci Series--------------------------------------------------
    @RequestMapping("/fibonacci")
    public String fibonacci(){

        int num1 = 0,num2 = 1 ,num3,i,count = 10;
        String result = ("Fibonacci series is :" + num1+ " " + num2);

        for( i = 2; i<count; ++i){
            num3 = num1+num2;
            result += (" "+num3);
            num1 = num2;
            num2 = num3;

//            result+= result;

        }
        return result;
    }


    //---------------------Assignment 5- Percentage --------------------------------------------------

    @RequestMapping("/percentage")
    public String percentage_marks(){

        String result_Percentage = "";
        double math_Marks = 98;
        double science_Marks = 67;
        double hindi_Marks = 88;
        double english_Marks = 68;
        double art_Marks = 48;

        double percentage = ((math_Marks+science_Marks+hindi_Marks+english_Marks+art_Marks)*100)/500;
        result_Percentage = "Congratulation You are passed with "+ percentage +"%";
        return result_Percentage;

    }


    //---------------------Assignment 5- Armstrong for thee digits --------------------------------------------------

@RequestMapping("/armstrong")
    public String armstrong(){

       int n = 153;
       int temp = n;
       int r ,sum=0;
       String result = "";

       while(n>0){
       r = n%10;
       n = n/10;

       sum= sum + r*r*r;

        }

       if (temp == sum){
           result = temp +" is an armstrong number";
       }

       else {
           result = temp +" is an not armstrong number";
       }

       return result;
    }

    //---------------------Assignment 5- Armstrong for any number --------------------------------------------------

@RequestMapping("/armstrongAny")
    public String armstrongAny(){

        int input = 1634;
        double result = 0;
        int count = 0;
        String output="";
        for(int temp = input; temp!=0; count++){
            temp=temp/10;
        }
        for(int temp = input; temp!=0; temp=temp/10){
           int remainder = temp%10;
           result +=Math.pow(remainder,count);

           if (input == result){

               output = input +" is an Armstrong Number";
           }
           else {
               output = input +" is not an Armstrong Number";
           }

        }

        return output;

    }

}
