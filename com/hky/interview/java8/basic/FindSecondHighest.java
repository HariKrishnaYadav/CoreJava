package com.hky.interview.java8.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FindSecondHighest {
    static void main(String[] args) {
        int[]  num={4,6,2,8,7,3,4,5};
        Integer res = Arrays.stream(num).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(res);
    }
}
