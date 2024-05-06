package com.hky.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="i like this program very much";
        String words[]=str.split("\\s+");
        for(int i=0;i<words.length/2;i++){
           String temp=words[i];
           words[i]=words[words.length-1-i];
           words[words.length-1-i]=temp;
        }
     for (String word:words){
         System.out.print(word+" ");
     }
    }
}
