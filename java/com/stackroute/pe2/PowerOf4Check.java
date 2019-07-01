package com.stackroute.pe2;

public class PowerOf4Check {
    public String powerOf4Check(int num)
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
