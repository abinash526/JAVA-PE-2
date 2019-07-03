package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTesterTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toTestANumIsEven() {
        String result= EvenNumTester.isEven(24);
        assertEquals("true",result);
    }
    @Test
    public void toTestANumIsNotEven() {
        String result= EvenNumTester.isEven(29);
        assertEquals("false",result);

    }
}