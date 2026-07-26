package com.hky.interview.java8.basic;


import java.util.List;
import java.util.stream.Collectors;

public class SortByAlphabetically {
    static void main(String[] args) {
        String str="debac";
        List<Character> res = str.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList());

        System.out.println(res);
    }
}
