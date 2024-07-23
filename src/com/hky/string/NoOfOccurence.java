package com.hky.string;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoOfOccurence {
    public static void main(String[] args) {
        String str="harekrishna";
        str.chars().mapToObj(i -> (char) i).collect(Collectors.toSet()).forEach(e-> System.out.print(e));
    }
}
