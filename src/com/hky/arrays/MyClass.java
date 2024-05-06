package com.hky.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MyClass {
    public static void main(String[] args) {
        String[] ar = { "c", "d", "b", "a", "e" };
        NestedClass in = new NestedClass();
        Arrays.sort(ar, in);
        for (String str : ar)

            System.out.print(str + " ");
        System.out.println(Arrays.binarySearch(ar, "b"));
    }

    static class NestedClass implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    }
}
