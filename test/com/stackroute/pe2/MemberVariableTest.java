package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable ob;

    @Before
    public void setUp() throws Exception {
        ob=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
   public void setDetailsOfMembers() {
        String result=ob.set("Abinash",21,30000.00);
        assertEquals("Members Name: Abinash\nMembers Age: 21\nMembers Salary: 30000.0\n",result);

    }
    public void setDetailsOfMember2() {
        String result2=ob.set("Harry",23,35000.00);
        assertEquals("Members Name: Harry\nMembers Age: 23\nMembers Salary: 35000.0\n",result2);

    }
}