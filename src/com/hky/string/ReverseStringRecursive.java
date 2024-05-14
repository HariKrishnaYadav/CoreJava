package com.hky.string;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        String str = "harekrishna";
        System.out.println("Reverse::" + revString(str));
    }

    private static String revString(String str) {
        if (str.length() == 1)
            return str;
        else return str.charAt(str.length() - 1) + revString(str.substring(0, str.length() - 1));
    }

}
