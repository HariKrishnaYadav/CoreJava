package com.hky.maps;

import java.util.Scanner;

public class FindFrequencyOfCharacter {
    public static void main(String[] args) {
        int i;
        String str;
        int counter[]=new int[256];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:::");
        str=scanner.nextLine();
        for (i=0;i<str.length();i++){
            counter[(int)str.charAt(i)]++;
        }
        for (i=0;i<256;i++){
            if(counter[i]!=0){
                System.out.println("The character " + (char)i + " has occurred for " +counter[i]+ " times ");
            }
        }

    }
}
