/*
* Write a Java method to check if a given number is power of 4*/
package com.stackroute.pe2;

public class PowerOf4Checker {
    public String powerOf4Check(int num)//Checks if power of 4 by diving it by 4 continously
    {
        int test=num;
        while(test>4)
        {
            test=test/4;
        }
        if(test==4)
        {
            return "yes";
        }
        else
            return "no";
    }
}
