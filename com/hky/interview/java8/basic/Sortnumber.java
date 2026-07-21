package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.List;

public class Sortnumber {
    static void main(String[] args) {
        int[] num={4,6,2,7,3,9,2,5,3,6};
        List<Integer> res = Arrays.stream(num).boxed().sorted().toList();
        System.out.println(res);
    }
}
