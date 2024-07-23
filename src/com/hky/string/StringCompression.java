package com.hky.string;

public class StringCompression {
    public static void main(String[] args) {
        String input = "AAABBBCCCCAA";
        String output = compressString(input);
        System.out.println("Compressed string: " + output);
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char prevChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar).append(count);
                prevChar = currentChar;
                count = 1;
            }
        }

        // Append the last set of characters
        compressed.append(prevChar).append(count);

        return compressed.toString();
    }
}

