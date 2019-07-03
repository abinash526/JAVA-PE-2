package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeCheckerTest {
    PallindromeChecker ob;

    @Before
    public void setUp() throws Exception {
        ob=new PallindromeChecker();
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
    @Test
    public void pallindromeCheckForNull() {
        String result=ob.pallindromeCheck(null);
        assertNull(result);

    }
    @Test
    public void pallindromeCheckForNotNull() {
        String result=ob.pallindromeCheck("wertrew");
        assertNotNull(result);

    }
}