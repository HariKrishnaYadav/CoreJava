package com.hky.string;

public class Test {
    public static void main(String[] args) {
        String str="I am going to patna";
        String[] rev=str.split("\\s+");
        for(int i=rev.length-1;i>=0;i--){
            System.out.print(rev[i]+" ");
        }
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println("reverse:"+reverse);

//       for(String r:rev){
//           System.out.print(r+" ");
//       }
    }
}
