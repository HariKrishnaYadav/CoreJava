package com.hky.Java17;

public class InstanaceOfTest {
    public static void main(String[] args) {
        Object s = "Hare";

        if (s instanceof String s1) {
            System.out.println(s1);
        } else if (s instanceof Integer i) {
            System.out.println(i);
        }
    }
}
