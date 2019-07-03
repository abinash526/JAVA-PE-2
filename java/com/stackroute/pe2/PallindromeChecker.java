/*
* Write a Java method to Reverse the given input & Check if it is a Palindrome.*/
package com.stackroute.pe2;

public class PallindromeChecker {
    public String pallindromeCheck(String input)//This method is reversing the string and returning
    {
        if(input==null)
            return null;
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
