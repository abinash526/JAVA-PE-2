package com.stackroute.pe2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyFile {
    public String wordFrequencyFile(String path) throws IOException {
        FileReader fr=new FileReader(path);
        int i;
        String out="";

        while((i=fr.read())!=-1)
            out=out+((char)i);
        fr.close();
        String[] arrOut=out.split(" |,");
        //System.out.println(arrOut.length);
        //int[] countFreq=new int[arrOut.length];
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
            //h.put(arrOut[i],1);

        }
        Set set = h.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            out=out+ (" "+ mentry.getKey() + ":-");
            out=out+(mentry.getValue());
        }


       /* for(i=0;i<arrOut.length;i++)
        {
           for(int j=0;j<arrOut.length;j++)
           {
               if(arrOut[i].equals(arrOut[j]))
               {
                   countFreq[i]++;
               }
           }
        }*/

        return out;
    }

}
