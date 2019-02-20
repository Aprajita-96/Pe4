package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortingCharacterTest {
    SortingCharacter object;

    @Before
    public void setUp() throws Exception {
        object=new SortingCharacter();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void sort() {
//        String expected="apple bat cat dog elephant";
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("bat");
        list.add("cat");
        list.add("dog");
        list.add("elephant");

       String actual="dog elephant bat cat apple";
       assertEquals(list,object.sort(actual));

    }
}