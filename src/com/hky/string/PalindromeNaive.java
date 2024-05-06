package com.hky.string;

public class PalindromeNaive {
    public static void main(String[] args) {
        String str="geeks";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Str is Palindrome");
        }else {
            System.out.println("Str is not Palindrome");
        }
    }
}
