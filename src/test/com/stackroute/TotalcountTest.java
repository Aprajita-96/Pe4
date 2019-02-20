package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalcountTest {
    Totalcount object;

    @Before
    public void setUp() throws Exception {
        object=new Totalcount();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void countFunction() {
        int expected=10;
        String input="java is java again java again";
        char a='a';
        assertEquals(expected,object.countFunction(input,a));
    }
}