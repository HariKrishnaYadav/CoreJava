package com.hky.string;

public class StringTest {
    public static void main(String[] args) {
        A a = new A(50);

        String s = "Java";

        //Concatenating a string object with A-type

        System.out.println(s+a);
        B b = new B(100);
        B b1 = new B(100);
        System.out.println(b.equals(b1));

        //Concatenating string object with B-type

        System.out.println(s+b);

        String s1 = null;

        String s2 = null;

        System.out.println(s1+s2);       //Output : nullnull

        System.out.println("null"+"null");    //Output : nullnull

        System.out.println(s1+"JAVA"+s2);
    }
}
