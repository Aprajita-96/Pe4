package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//a program to replace the alphabets and again print the string.

public class ReplaceCharacterTest {
    ReplaceCharacter object;

    @Before
    public void setUp() throws Exception {
        object=new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void replace() {
        String expected="faity fry";
        String actual="daily fry";
        assertEquals(expected,object.replace(actual));
    }
}