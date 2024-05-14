package com.hky.string;

import java.util.stream.Stream;

public class NoOfOccurence {
    public static void main(String[] args) {
        String str="harekrishna";
        Stream<Character> ch=str.chars().mapToObj(i-> (char) i);
        
    }
}
