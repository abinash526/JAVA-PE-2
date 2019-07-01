package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades ob;

    @Before
    public void setUp() throws Exception {
        ob=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void calcAvgMinMax() {
        int[] markArr={23,54,45,76,98};

        String res=ob.studentGrades(5,markArr);
        assertEquals("Average is "+59.2+"\nMaximum is "+98+"\nMinimum is "+23,res);


    }
  /*  @Test
    public void calcForNull() {

        int[] nullMark={23,'a',45,65,8};
       // String res=ob.studentGrades(5,markArr);
        String res=ob.studentGrades(5,nullMark);
        assertEquals("Not a number",res);


    }*/
}