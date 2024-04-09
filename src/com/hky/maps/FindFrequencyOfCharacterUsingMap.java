package com.hky.maps;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequencyOfCharacterUsingMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:::");
        String str=sc.nextLine();
        HashMap<Character,Integer> countRepeatedChar=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(countRepeatedChar.containsKey(ch)){
                int count=countRepeatedChar.get(ch)+1;
                countRepeatedChar.put(ch, count);
            }else{
                countRepeatedChar.put(ch,1);
            }
        }
        System.out.println("countRepeatedChar::"+countRepeatedChar);
    }
}
