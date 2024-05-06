package com.hky.string;

public class SentenceExchange1 {
    public static void main(String[] args) {
        String sentence = "Pandit badri parsad har har bole";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        int p=0;
        int b=words.length-1;
         String temp=words[0];
          words[0]=words[b];
          words[b]=temp;


        // Exchange the positions of "Pandit" and "bole"


        // Reconstruct the modified sentence
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
           modifiedSentence.append(word).append(" ");

           //System.out.print(word+" ");

        }

        // Print the modified sentence
       System.out.println(modifiedSentence.toString().trim());
    }
}

