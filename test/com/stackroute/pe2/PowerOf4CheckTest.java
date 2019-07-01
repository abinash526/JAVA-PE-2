package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4CheckTest {
    PowerOf4Check ob;

    @Before
    public void setUp() throws Exception {
    ob=new PowerOf4Check();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkForpowerOf4Check() {
        String result=ob.powerOf4Check(64);
        assertEquals("yes",result);

    }
    public void checkForNotPowerOf4() {
        String result=ob.powerOf4Check(68);
        assertEquals("no",result);

    }
}