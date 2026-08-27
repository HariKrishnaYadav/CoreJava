package com.hky.interview.java8.basic;

public class ReverseWord {
    static void main() {
        String str="java is important language";
        System.out.println(reverseWord(str));
    }

    private static String  reverseWord(String str) {
        StringBuilder sb=new StringBuilder();
        if(str!=null && str.isEmpty()){
            return  str;
        }
      String[]  words= str.trim().split("\\s");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
