package com.stackroute;

public class ReplaceCharacter {
    //a program to replace the characters from the string and return the string.
    public String replace(String s){

        String s1=s.replaceAll("d","f");
        String s2=s1.replaceAll("l","t");
        return s2;
    }
}
