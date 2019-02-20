package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryThereTest {
    HarryThere object;
    @Before
    public void setUp() throws Exception {
        object=new HarryThere();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void find() {
        boolean expected=true;
        String actual="is harry there";
        boolean expected1=false;
        String actual1="is henry there?";
        assertEquals(expected,object.findHarry(actual));
        assertEquals(expected1,object.findHarry(actual1));
    }
}