package com.hky.leetcode.strings.test;

public class Test1 {
    public static void main(String[] args) {
        String   s = "  Hello World hare krishna    ";

        String[]  str = s.split(" ");
         int l=0;
         for(String s1:str){
             l=s1.length();
         }
        System.out.println(l);

    }
}
