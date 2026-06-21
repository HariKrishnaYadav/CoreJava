package com.hky.interview;

public class CommonString {
    public static void main(String[] args) {
        String s1 = "harekrishnaji";
        String s2 = "mr.krishnayadav";

        String common = findLongestCommonSubstring(s1, s2);

        System.out.println("Common String: " + common);
    }

    public static String findLongestCommonSubstring(String s1, String s2) {
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);

                if (s2.contains(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }
}