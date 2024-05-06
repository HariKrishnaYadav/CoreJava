package com.hky.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] a= {"geeksforgeeks", "geeks", "geek", "geezer"," geez"};
//        for(String in:a){
//            System.out.println(in);
//        }
        System.out.println("===============================");
        int size=a.length;
        Arrays.sort(a);
        int end = Math.min(a[0].length(), a[size-1].length());
//        for(String in:a){
//            System.out.println(in);
//        }
    }
}
