package com.hky.interview.java8.basic;

import java.util.Arrays;

public class FindVowelWithSpecifiedNumber {
    static void main(String[] args) {
        String s="I am learning java stream api";
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==3).forEach(System.out::println);
    }
}
