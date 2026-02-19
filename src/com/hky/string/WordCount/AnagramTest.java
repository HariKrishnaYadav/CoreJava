package com.hky.string.WordCount;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        boolean status=false;
        String srt1=str1.replaceAll("\\s+","").toLowerCase();
        String srt2=str2.replaceAll("\\s+","").toLowerCase();
        if(srt1.length()!=srt2.length())
            status=false;
        char[] ch1=srt1.toCharArray();
        char[] ch2=srt2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        status= Arrays.equals(ch1,ch2);
        return status;
    }
}
