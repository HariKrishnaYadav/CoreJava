package com.hky.abs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args)
    {
        B b = new B();

        System.out.println(b.i);

       // a.m1(null);
        String  str="harekrishna harekrishna";
       // String[] s = str.split("[^a-zA-Z0-9]");
        String s = str.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
       // Arrays.stream(s).distinct().forEach(e-> System.out.println(e));
         String s1=str.chars().distinct().mapToObj(ch->(char)ch).map(Object::toString).collect(Collectors.joining());
        System.out.print(s1+" ");

    }


}
