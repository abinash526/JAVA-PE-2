package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeCheckTest {
    PallindromeCheck ob;

    @Before
    public void setUp() throws Exception {
        ob=new PallindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void pallindromeCheckForAString() {
        String result=ob.pallindromeCheck("wertrew");
        assertEquals("pallindrome",result);
        String result2=ob.pallindromeCheck("werty");
        assertEquals("not a pallindrome",result2);

    }
}