package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString object;

    @Before
    public void setUp() throws Exception {
        object=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void transpose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actual="a quick brown fox jumps over the lazy dog";
        assertEquals(expected,object.transpose(actual));
    }
}