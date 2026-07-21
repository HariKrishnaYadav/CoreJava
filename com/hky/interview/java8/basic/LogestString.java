package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.Comparator;

public class LogestString {
   public static void main(String[] args) {
        String str="I am going to patna ";
     String logest=Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();

       System.out.println(logest);
   }
}
