package com.hky.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args) {
        String[] str={"hare","krishna","yadav","kavya","dev"};
        int longestString=0;
        for(String s:str){
            if(longestString<s.length()){
                longestString=s.length();
            }
        }
        System.out.println("longestString:"+longestString);
        String longestStringWithJava8 = Arrays.stream(str).max(Comparator.comparingInt(String::length)).get();
        System.out.println("longestStringWithJava8::"+longestStringWithJava8.length());
    }
}
