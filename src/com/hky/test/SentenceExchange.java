package com.hky.test;

public class SentenceExchange {
    public static void main(String[] args) {
        String sentence = "Pandit badri parsad har har bole";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Find the indices of "Pandit" and "bole"
        int panditIndex = -1;
        int boleIndex = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Pandit")) {
                panditIndex = i;
            }
            if (words[i].equals("bole")) {
                boleIndex = i;
            }
        }

        // Exchange the positions of "Pandit" and "bole"
        if (panditIndex != -1 && boleIndex != -1) {
            String temp = words[panditIndex];
            words[panditIndex] = words[boleIndex];
            words[boleIndex] = temp;
        }

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

