/*
* Write a program to find all files of a folder and select only given extention fileName and
read content of this file using byte array*/
package com.stackroute.pe2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileListSearcher {
    public String fileSearch(String path,String extension) throws IOException { //Searching the file lists using the file path
        String listFiles="";
        String outp="";
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            // array for files and sub-directories
            // of directory pointed by directory
            File arr[] = directory.listFiles();

            for (File f : arr) {
                //if (f.isFile())
                    listFiles=listFiles+f.getName()+"\n";
                    if(f.getName().contains(extension))
                    {

                        FileInputStream fr=new FileInputStream(f);
                        byte[] reader=new byte[(int)f.length()];
                        fr.read(reader);
                        String s = new String(reader);
                        listFiles=listFiles+s+"\n";
                    }
            }
        }
        System.out.println(listFiles);
        return listFiles;
    }


}
