/*
* A boolean method called isEven() in a class called EvenNumTest, which takes
an int as input and returns true if the input is even. The signature of the method is as
follows: public static boolean isEven(int number)*/
package com.stackroute.pe2;

public class EvenNumTester {
    public static String isEven(int inputNum){
        //Checking for Even and Odd

        if(inputNum%2==0)
            return "true";
        else
            return "false";


    }
}
