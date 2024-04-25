package com.hky.string;

import java.util.Scanner;

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :: ");
        String[] words=sc.nextLine().split("\\s+");
        System.out.println("Words with even length:");
        for(String word:words){
           if(word.length()%2==0){
               System.out.println("word:::"+word);
           }
        }

    }
}
