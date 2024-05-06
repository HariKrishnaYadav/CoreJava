package com.hky.string;

public class TwoPointerApproachForPalindromeProgram {
    public static void main(String[] args)
    {
        // Input string
        String str = "abbaf";

        // Convert the string to lowercase
        str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }

    private static boolean isPalindrome(String str) {
        boolean status=false;
        int i=0, j=str.length()-1;
        while (i<j){
            if(str.charAt(i)==str.charAt(j)){
                status=true;
            }else {
                status=false;
            }
            i++;
            j--;
        }
        return status;
    }
}
