package com.hky.string;

import java.util.Scanner;

public class CheckPalindrom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();

        if (isPlalindrom(str)) {
            System.out.println(str + " is palindrom");
        } else {
            System.out.println(str + " is not palindrom");
        }
    }

    private static boolean isPlalindrom(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        String rev = "";
        for (int i = right; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (!s.equals(rev)) {
            return false;
        } else {
            return true;
        }


    }
}
