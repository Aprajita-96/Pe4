package com.stackroute;
//Write a java program to count the total number of occurrences of a given character in a string without using any loop
public class Totalcount {
//    a function which checks the occurance of a character in a string.
    public int countFunction(String input,char a){
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a'){
                count++;
            }
        }
return count;
    }
}
