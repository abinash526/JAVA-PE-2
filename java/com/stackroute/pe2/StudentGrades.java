/*
* Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.
Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77The average is 81.50
The minimum is 65
The maximum is 98*/
package com.stackroute.pe2;


import java.util.Arrays;
import java.util.Collections;

public class StudentGrades {
    public String studentGrades(int numberOfGrades,int[] numArr)//Calling and printing Maximum Minimum and Average
    {

        int p=0;
        String string=Arrays.toString(numArr);
        System.out.println(string);

        int min=minimum(numArr);
        int max=maximum(numArr);
        float avg=average(numArr);
        System.out.println("Average is "+avg+"\nMaximum is "+max+"\nMinimum is "+min);
        return "Average is "+avg+"\nMaximum is "+max+"\nMinimum is "+min;


    }

    public float average(int[] numArr) {//Finding Average
        int sum=0;
        float avg;
        for(int i=0;i<numArr.length;i++)
        {
            sum=sum+numArr[i];
        }
        return (float)sum/numArr.length;
    }

    public int minimum(int[] numArr)//Finding minimum
    {
        Integer[] intArr = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
        int min=Collections.min(Arrays.asList(intArr));
        return min;
    }
    public int maximum(int[] numArr)//Finding Maximum
    {
        Integer[] intArr = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
        int min=Collections.max(Arrays.asList(intArr));
        return min;
    }
}
