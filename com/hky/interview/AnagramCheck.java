package com.hky.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        boolean result =
                Arrays.stream(s1.split(""))
                        .sorted()
                        .collect(Collectors.joining())
                        .equals(
                                Arrays.stream(s2.split(""))
                                        .sorted()
                                        .collect(Collectors.joining())
                        );
    }
}
