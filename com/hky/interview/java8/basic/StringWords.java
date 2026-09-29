package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.Comparator;

public class StringWords {
  public   static void main(String[] args) {
        String[] str = {"hare","am", "learning" ,"java" ,"stream" ,"" +
                "api"};
        Arrays.stream(str).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

}
