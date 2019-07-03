/*
* Write a program to calculate the frequency of the words in a given file,Example: Create a file named FileDemo.txt with the following content
i am a man ,
i like to sleep ,
i have a home.
Output: i->3 times,
am-1,
like -1,
have -1,
a-2 etc.,*/
package com.stackroute.pe2;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyFile {
    public String wordFrequencyFile(String path) throws IOException {//Reading from file path
        FileReader fileReader=new FileReader(path);
        int i;
        String outputString="";

        while((i=fileReader.read())!=-1)
            outputString=outputString+((char)i);
        fileReader.close();//Reading using FileReader
        String[] arrOut=outputString.split(" |,");

        HashMap<String,Integer> h = new HashMap();
        for(i=0;i<arrOut.length;i++)
        {
           arrOut[i]=arrOut[i].trim();
            h.put(arrOut[i],0);
        }
        for(i=0;i<arrOut.length;i++)
        {
            if(h.containsKey(arrOut[i]))
            {
                int temp=h.get(arrOut[i]);
                h.put(arrOut[i],temp+1);
            }


        }
        Set set = h.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            outputString=outputString+ (" "+ mentry.getKey() + ":-");
            outputString=outputString+(mentry.getValue());
        }




        return outputString;
    }

}
