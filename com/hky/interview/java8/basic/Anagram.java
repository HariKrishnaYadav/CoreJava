package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean flag=checkAnagram(s1,s2);
        if(flag){
            System.out.println(s1+" "+s2+"  are Anagram");
        }else{
            System.out.println(s1+" "+s2+"  are not Anagram");
        }


    }

    private static boolean checkAnagram(String s1, String s2) {
          boolean  flag=false;
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        if(s3.length()!=s4.length()){
            flag=false;
        }
      flag=Arrays.stream(s3.split("")).sorted().collect(Collectors.joining()).
                equals(Arrays.stream(s4.split("")).sorted().collect(Collectors.joining()));

        return   flag;

    }
}
