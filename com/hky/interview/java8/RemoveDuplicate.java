package com.hky.interview.java8;

public class RemoveDuplicate {
   public static void main(String[] args) {
       String str="harekrishnayadav";
       str.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);

    }
}
