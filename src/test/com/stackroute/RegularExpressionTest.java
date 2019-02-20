package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression object;

    @Before
    public void setUp() throws Exception {
        object=new RegularExpression();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void occurance() {
        ArrayList<String> list=new ArrayList<>();
        list.add("4 6");
        list.add("10 12");
        list.add("27 29");
        String actual="She sells seashells by the seashore";
        assertEquals(list,object.occurance(actual));
    }
}