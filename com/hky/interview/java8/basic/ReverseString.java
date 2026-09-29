package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

  public   static void main(String[] args) {
        String str="hare krishna yadav";
        String res = Arrays.stream(str.split(" ")).
                map(words -> new StringBuilder(words)
                        .reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(res);
    }
}
