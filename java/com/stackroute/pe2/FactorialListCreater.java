/*
* Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1
The factorial of 2 is 2
..........
The factorial of 12 is 479001600
he factorial of 13 is out of range
Modify your program and add a method called longFactorial to list all the factorial that can
be expressed as a long (64-bit signed integer).The maximum value for long is kept in a
constant called Long.MAX_VALUE.
your output shall look like:
Long Factorials:
The factorial of 1 is is 1.
The factorial of 2 is is 2.
..........
The factorial of 20 is is 2432902008176640000.
The factorial of 21 is out of range.*/
package com.stackroute.pe2;

import java.math.BigDecimal;

public class FactorialListCreater { //To Calculate Factorial List


    public String longFactorial() {

        String numberList = "";
        BigDecimal bigNumber = new BigDecimal(1);
        System.out.println("List of factorils under long value is");
        for (int i = 1; ; i++) {
            //Number is compared with the Maximum value
            if (bigNumber.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 && bigNumber.multiply(new BigDecimal(i+1)).compareTo(new BigDecimal(Long.MAX_VALUE))<0) {
                //Number is multiplied using Big Decimal
                bigNumber = bigNumber.multiply(new BigDecimal(i));
                System.out.println(i);
                numberList = numberList + i;
                numberList=numberList+"\n";

            }
            else{
                break;
            }
        }
        return numberList;

    }
    public String intFactorial() {//To return the list of Integer Factorial
        String outp = "";
        BigDecimal bigNumber = new BigDecimal(1);
        BigDecimal ob2;
        int j=1;
        System.out.println("List of factorials under int value is");
        for (int i = 1; ; ) {
            if (bigNumber.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0&&bigNumber.multiply(new BigDecimal(i+1)).compareTo(new BigDecimal(Integer.MAX_VALUE))<0){
                ob2=bigNumber;

                bigNumber = bigNumber.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp=outp+"\n";

            }
            else{
                break;
            }
            i++;
        }
        //System.out.println(bigNumber);
        return outp;

    }


}