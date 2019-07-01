package com.stackroute.pe2;


import java.util.Arrays;
import java.util.Collections;

public class StudentGrades {
    public String studentGrades(int numberOfGrades,int[] numArr)
    {
        //int[] numArr=new int[numberOfGrades];
       // for(int count)
        int p=0;
        String str=Arrays.toString(numArr);
        System.out.println(str);
       /* for(int i=0;i<numberOfGrades;i++)
        {
                if(str.charAt(i)+48<'0'||str.charAt(i)+48>'9'){
                    return "Not a number";
                }
        }*/
        int min=minimum(numArr);
        int max=maximum(numArr);
        float avg=average(numArr);
        System.out.println("Average is "+avg+"\nMaximum is "+max+"\nMinimum is "+min);
        return "Average is "+avg+"\nMaximum is "+max+"\nMinimum is "+min;
       // Integer[] intArr = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
       //Collections.min(Arrays.asList(intArr));

    }

    public float average(int[] numArr) {
        int sum=0;
        float avg;
        for(int i=0;i<numArr.length;i++)
        {
            sum=sum+numArr[i];
        }
        return (float)sum/numArr.length;
    }

    public int minimum(int[] numArr)
    {
        Integer[] intArr = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
        int min=Collections.min(Arrays.asList(intArr));
        return min;
    }
    public int maximum(int[] numArr)
    {
        Integer[] intArr = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
        int min=Collections.max(Arrays.asList(intArr));
        return min;
    }
}
