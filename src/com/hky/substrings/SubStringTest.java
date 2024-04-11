package com.hky.substrings;

public class SubStringTest {
    public static void main(String[] args) {
        String str="sujeet";

        System.out.println("0-1---->"+str.substring(0,1).toUpperCase()+str.substring(1));

        String Str = new String("Welcome to geeksforgeeks");

        // using substring() to extract substring
        // returns geeks
        System.out.print("The extracted substring  is : ");
        System.out.println(Str.substring(10, 16));
        String str1="sujeet";
        System.out.println(str1.substring(1,str1.length()-2));
    }
}
