package com.hky.stringMethods;

public class CharAtExample {
    public static void main(String[] args) {
        // Define a string
        String str = "Hello, World!";
        int l=str.length();

        // Retrieve characters at different indices
        char charAtIndex5 = str.charAt(5); // Retrieves the character 'o' at index 5
        char charAtIndex8 = str.charAt(8); // Retrieves the character 'W' at index 8
        char charAtIndex4 = str.charAt(4); // Retrieves the character 'W' at index 4


        // Display the retrieved characters
        System.out.println("Character at index 5: " + charAtIndex5);
        System.out.println("Character at index 8: " + charAtIndex8);
        System.out.println("Character at index 4: " + charAtIndex4);
    }
}
