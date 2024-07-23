package com.hky.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestJava8 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 8, 3, 9,20};
        Integer sencondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("sencondLargest :"+sencondLargest);
    }
}
