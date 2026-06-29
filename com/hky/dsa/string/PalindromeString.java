package com.hky.dsa.string;



public class PalindromeString {
    public static void main(String[] args) {
        String s = "abba";
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = true;
                break;
            }
                left++;
                right--;

            }

            if (isPalindrome) {
                System.out.println(s + " is palindrome");
            } else {
                System.out.println(s + " is not palindrome");
            }


        }
    }

