package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program with the implementation of Regular Expression to find the presence of the name
//Harry in a string.

public class HarryThere {
//    finds the word harry
    public boolean findHarry(String s){
        Pattern object=Pattern.compile("harry");
        Matcher object1=object.matcher(s);


        return object1.find();

    }
}
