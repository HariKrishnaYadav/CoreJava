package com.hky.string;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str="Hare krishna is preparing java interview";
        str=str.toLowerCase();
        int total_count=str.length();
        int total_count_after_remove=str.replace("a","").length();
        int count=total_count-total_count_after_remove;
        System.out.println("count::"+count);
    }
}
