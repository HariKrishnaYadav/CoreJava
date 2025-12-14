package com.hky.string.WordCount;

public class WordCountSplit {
    public static void main(String[] args) {
        String str="hare Krishna is preparing for java interview ";
        int count = str.trim().split("\\s").length;
        System.out.println("count :::"+count );
    }
}
