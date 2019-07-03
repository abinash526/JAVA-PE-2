/*
* Write a program to read the content of a text file, convert the content in upper case
and print the same in console along with the length of the file.*/
package com.stackroute.pe2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileValueReader {
    public String readFile(String filePath) throws IOException {//Reading the file using FileReader
      java.io.FileReader fr=new java.io.FileReader(filePath);
        int i;
        String out="";
        while((i=fr.read())!=-1)
            out=out+((char)i);
        fr.close();
        int length=out.length();
        out=out+"The length is "+length;
        System.out.println(out.toUpperCase());
        return out.toUpperCase();
    }



    }
