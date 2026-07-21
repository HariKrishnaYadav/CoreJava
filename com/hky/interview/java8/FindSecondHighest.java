package com.hky.interview.java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighest {
    static void main(String[] args) {
        String s="I am learning java stream api";
      String  secondHighest=Arrays.stream(s.split(" "))
              .sorted(Comparator.comparing(String::length).reversed()).
              skip(1).findFirst().get();
        System.out.println(secondHighest);
        int l=Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(l);
    }
}
