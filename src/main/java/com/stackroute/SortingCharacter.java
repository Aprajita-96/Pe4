package com.stackroute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Write a program that sets up a String variable containing a paragraph of text of your choice.
public class SortingCharacter{
    ArrayList<String> list=new ArrayList<String>();
//    returns a list wherein all the letters are arranged.
    public ArrayList<String> sort(String s){
        String[] array=s.split(" ");
        for(String a:array){
            list.add(a);
        }
        Collections.sort(list);
        return list;
    }

}
