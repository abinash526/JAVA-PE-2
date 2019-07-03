package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class WordFrequencyFileTest {
    WordFrequencyFile ob;

    @Before
    public void setUp() throws Exception {
        ob=new WordFrequencyFile();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void countWordFrequencyFile() throws IOException {
        String res=ob.wordFrequencyFile("/home/abinash/IdeaProjects/PE2/demo.txt");
        assertEquals("i am a man,\n" +
                "i like to sleep,\n" +
                "i have a home.\n" +
                " sleep:-1 a:-2 home.:-1 like:-1 have:-1 i:-3 man:-1 to:-1 am:-1",res);

    }
    @Test
    public void countWordFrequencyFileNull() throws IOException {
        String res=ob.wordFrequencyFile(null);
        assertNull(res);

    }
}