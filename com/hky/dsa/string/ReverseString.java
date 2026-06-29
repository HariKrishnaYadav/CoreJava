package com.hky.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String s="hare krishna yadav";
        StringBuffer res=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            res.append(s.charAt(i));
        }
        System.out.println(res.toString());

        System.out.println("------");
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
        System.out.println("--------");
        String reversed1="";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed1 += s.charAt(i);
        }

        System.out.println(reversed1);


        System.out.println("-----");
        String s1= "hare";

        String reversed2= java.util.stream.IntStream.range(0, s1.length())
                .mapToObj(i -> s.charAt(s.length() - 1 - i))
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining());

        System.out.println(reversed2);
    }
}
