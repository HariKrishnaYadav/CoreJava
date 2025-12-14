package com.hky.string.WordCount;

public class WordCountManual {
    public static void main(String[] args) {
        String str="hare Krishna is preparing for java interview";
          int count=0;
          boolean isWord=false;
          for(int i=0;i<str.length();i++){
              char c=str.charAt(i);
              if(Character.isLetter(c)){
                  isWord=true;
              }else  if(isWord){
                  count++;
                  isWord=false;
              }
          }
          if(isWord)
              count++;
        System.out.println("count::"+count);
    }
}
