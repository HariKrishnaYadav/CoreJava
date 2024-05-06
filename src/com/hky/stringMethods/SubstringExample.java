package com.hky.stringMethods;

public class SubstringExample {
    public static void main(String[] args) {
        // Full name
        String fullName = "Hare Krishna Yadav";
        //System.out.println("fullName:"+fullName.indexOf(5));
        // Extracting the first name
        String firstName = fullName.substring(0, fullName.indexOf(" "));

        // Displaying the first name
        System.out.println("First name: " + firstName);
    }
}

