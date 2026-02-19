package com.hky.string;

public class StringDemo {
    public static void main(String[] args) {

        String str1="Hello World";
        String str2="Hello World";
        String str3=new String("Hello World");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        for(char s:str1.toCharArray()){
            System.out.print(s+"");
        }
        System.out.println("--------");
        String locaton="New York,Los Angeles,Chicago,Houston,Phoenix";
        for(var s:locaton.split(" ,")){
            System.out.print(s+",");
        }
        String email="harekrishna.bhu@gmail.com";
        String[] parts=email.split("@");
        for(String part:parts){
            System.out.println(part);
        }
        System.out.println("Username: "+parts[0]);
        System.out.println("Domain: "+parts[1].lastIndexOf("."));
        System.out.println("Domain: "+parts[1].substring(0,parts[1].lastIndexOf(".")));
        System.out.println("Domain: "+parts[1].lastIndexOf("."));
        String str4="Hello";
        str1.concat("java2blog");
        System.out.println(str4);
       String str5=str1.concat("java2blog");
        System.out.println(str5);
    }
}
