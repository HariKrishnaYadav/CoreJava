package com.hky.string.WordCount;

import java.util.Arrays;

public class WordCountStream {
    public static void main(String[] args) {
        String str="hare Krishna is preparing for java interview";
      long count=Arrays.stream(str.trim().split("\\s")).count();
        System.out.println("count::"+count);
    }
}
