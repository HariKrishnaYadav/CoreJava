package com.hky.maps;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequencyOfCharacterUsingJava8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:::");
        String str=sc.nextLine();
        HashMap<Character,Integer> countRepeatedChar=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            countRepeatedChar.computeIfPresent(ch,(Character,count)->count+1);
            countRepeatedChar.computeIfAbsent(ch,character -> 1);
        }
        System.out.println("countRepeatedChar::"+countRepeatedChar);
    }
}
