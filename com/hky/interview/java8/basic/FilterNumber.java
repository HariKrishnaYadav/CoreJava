package com.hky.interview.java8.basic;

import java.util.Arrays;

public class FilterNumber {
    static void main(String[] args) {
        String[] str = {
                "hsre",
                "123",
                "958",
                "bcd",
                "4567",
                "0",
                "99999",
                "-100",
                "12.5",
                "abc123",
                "123abc",
                "A1B2",
                "",
                " ",
                "@#$",
                "007",
                "1000",
                "xyz",
                "55555",
                "786"
        };
        Arrays.stream(str).filter(x->x.matches("\\d+")).forEach(System.out::println);
    }
}
