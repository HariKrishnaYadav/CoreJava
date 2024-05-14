package com.hky.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        boolean status = false;
        String srt1=str1.replaceAll("\\s+","").toLowerCase();
        String srt2=str2.replaceAll("\\s+","").toLowerCase();
        if(srt1.length()!=srt2.length())
            status=false;
         char[] ch1=srt1.toCharArray();
        char[] ch2=srt2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        status=Arrays.equals(ch1,ch2);
        return status;
    }
}
