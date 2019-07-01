package com.stackroute.pe2;

public class PallindromeCheck {
    public String pallindromeCheck(String input)
    {
        StringBuffer temp=new StringBuffer();
        temp=temp.append(input);
        temp=temp.reverse();
        String outP=temp.toString();
        if(outP.equals(input))
        {
            return "pallindrome";
        }
        else
        {
            return "not a pallindrome";
        }
    }
}
