package com.hky.string;

public class ReverseStringWithStringBuilder {
    public static void main(String[] args) {
        String str="harekrishna";
        StringBuilder  sb=new StringBuilder();
        for(int i=str.length()-1;i>0;i--){
           sb=sb.append(str.charAt(i)) ;
        }
        System.out.println("Reverse::"+sb);
    }
}
