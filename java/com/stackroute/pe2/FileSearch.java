package com.stackroute.pe2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileSearch {
    public String fileSearch(String path,String extension) throws IOException {
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
    public static void main(String[] args) throws IOException {
        String maindirpath = "/home/abinash/IdeaProjects/PE2/";

        // File object
        File maindir = new File(maindirpath);
        File directory = new File("/home/abinash/IdeaProjects/PE2/");

        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories
            // of directory pointed by directory
            File arr[] = maindir.listFiles();
          // System.out.println(arr);
           for(File f:arr)
           {
              // if(f.isFile())
               FileInputStream fr=new FileInputStream(directory);
               byte[] reader=new byte[(int)f.length()];
               fr.read(reader);
               String s = new String(reader);
                   System.out.println(f.getAbsolutePath());
           }

           // System.out.println("**********************************************");
            //System.out.println("Files from main directory : " + directory);
            //System.out.println("**********************************************");


        }
    }

}
