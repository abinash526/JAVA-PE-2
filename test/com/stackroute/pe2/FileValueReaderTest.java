package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileValueReaderTest {
    FileValueReader ob;

    @Before
    public void setUp() throws Exception {
        ob=new FileValueReader();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/abinash/IdeaProjects/PE2/file.txt");

        assertEquals("HII THIS IS ABINASH KUMAR JENA WORKING AS A FULL STACK DEVELOPER IN IBM INDIA PRIVATE LIMITED.\nTHE LENGTH IS 95",result);


    }
}