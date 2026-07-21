package com.hky.strings.methods;

import java.util.Arrays;

public class StringAllMethod {

    public static void main(String[] args) {

        // Original String
        String str = "Hello, World!";

        System.out.println("Original String : " + str);

        char[] charArray = str.toCharArray();
        for(var v:charArray){
            System.out.print(v + " ,");
        }
      //  System.out.println("Character Array : " + Arrays.toString(charArray));


        // ==========================================================
        // 1. length()
        // Returns the total number of characters in the string.
        // Return Type: int
        // ==========================================================
        System.out.println("\n1. length()");
        System.out.println("Length : " + str.length());      //13

        // ==========================================================
        // 2. charAt(index)
        // Returns the character present at the specified index.
        // Return Type: char
        // Index starts from 0.
        // ==========================================================
        System.out.println("\n2. charAt()");
        System.out.println("Character at index 7 : " + str.charAt(7)); //W

        // ==========================================================
        // 3. substring(beginIndex)
        // Returns a new string from beginIndex to end.
        // ==========================================================
        System.out.println("\n3. substring(beginIndex)");
        System.out.println(str.substring(7));        //World!

        // ==========================================================
        // 4. substring(beginIndex, endIndex)
        // Returns characters from beginIndex to endIndex-1
        // ==========================================================
        System.out.println("\n4. substring(beginIndex,endIndex)");
        System.out.println(str.substring(7,12));     //World

        // ==========================================================
        // 5. indexOf()
        // Returns first occurrence index.
        // If not found returns -1.
        // ==========================================================
        System.out.println("\n5. indexOf()");
        System.out.println(str.indexOf("World"));     //7
        System.out.println(str.indexOf("o"));         //4

        // ==========================================================
        // 6. lastIndexOf()
        // Returns last occurrence index.
        // ==========================================================
        System.out.println("\n6. lastIndexOf()");
        System.out.println(str.lastIndexOf("o"));     //8

        // ==========================================================
        // 7. replace()
        // Replaces all occurrences.
        // ==========================================================
        System.out.println("\n7. replace()");
        System.out.println(str.replace("World","Java"));

        // ==========================================================
        // 8. replaceFirst()
        // Replaces only first occurrence.
        // ==========================================================
        System.out.println("\n8. replaceFirst()");
        System.out.println("banana".replaceFirst("a","A"));

        // ==========================================================
        // 9. toUpperCase()
        // Converts to uppercase.
        // ==========================================================
        System.out.println("\n9. toUpperCase()");
        System.out.println(str.toUpperCase());

        // ==========================================================
        // 10. toLowerCase()
        // Converts to lowercase.
        // ==========================================================
        System.out.println("\n10. toLowerCase()");
        System.out.println(str.toLowerCase());

        // ==========================================================
        // 11. trim()
        // Removes spaces from beginning and end.
        // ==========================================================
        System.out.println("\n11. trim()");
        String name = "   Java Programming   ";
        System.out.println("'" + name.trim() + "'");

        // ==========================================================
        // 12. startsWith()
        // Checks whether string starts with given prefix.
        // Return Type: boolean
        // ==========================================================
        System.out.println("\n12. startsWith()");
        System.out.println(str.startsWith("Hello"));

        // ==========================================================
        // 13. endsWith()
        // Checks whether string ends with given suffix.
        // ==========================================================
        System.out.println("\n13. endsWith()");
        System.out.println(str.endsWith("!"));

        // ==========================================================
        // 14. contains()
        // Checks whether substring exists.
        // ==========================================================
        System.out.println("\n14. contains()");
        System.out.println(str.contains("World"));

        // ==========================================================
        // 15. split()
        // Splits string into array.
        // ==========================================================
        System.out.println("\n15. split()");
        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));

        // ==========================================================
        // 16. isEmpty()
        // Returns true if length == 0
        // ==========================================================
        System.out.println("\n16. isEmpty()");
        System.out.println(str.isEmpty());

        // ==========================================================
        // 17. isBlank() (Java 11)
        // Returns true if string contains only spaces.
        // ==========================================================
        System.out.println("\n17. isBlank()");
        System.out.println("   ".isBlank());

        // ==========================================================
        // 18. equals()
        // Case-sensitive comparison.
        // ==========================================================
        System.out.println("\n18. equals()");
        System.out.println(str.equals("Hello, World!"));

        // ==========================================================
        // 19. equalsIgnoreCase()
        // Ignores uppercase/lowercase.
        // ==========================================================
        System.out.println("\n19. equalsIgnoreCase()");
        System.out.println(str.equalsIgnoreCase("hello, world!"));

        // ==========================================================
        // 20. compareTo()
        // Lexicographical comparison.
        // Returns:
        // 0 -> Equal
        // Positive -> Greater
        // Negative -> Smaller
        // ==========================================================
        System.out.println("\n20. compareTo()");
        System.out.println(str.compareTo("Hello, Java!"));

        // ==========================================================
        // 21. compareToIgnoreCase()
        // Ignores case while comparing.
        // ==========================================================
        System.out.println("\n21. compareToIgnoreCase()");
        System.out.println(str.compareToIgnoreCase("hello, java!"));

        // ==========================================================
        // 22. toCharArray()
        // Converts String into char[].
        // ==========================================================
        System.out.println("\n22. toCharArray()");
        System.out.println(Arrays.toString(str.toCharArray()));

        // ==========================================================
        // 23. concat()
        // Concatenates another string.
        // ==========================================================
        System.out.println("\n23. concat()");
        System.out.println(str.concat(" Welcome"));

        // ==========================================================
        // 24. valueOf()
        // Converts primitive/object into String.
        // ==========================================================
        System.out.println("\n24. valueOf()");
        int number = 100;
        System.out.println(String.valueOf(number));

        // ==========================================================
        // 25. repeat() (Java 11)
        // Repeats string specified number of times.
        // ==========================================================
        System.out.println("\n25. repeat()");
        System.out.println("Java ".repeat(3));

        // ==========================================================
        // 26. strip() (Java 11)
        // Unicode-aware trim.
        // ==========================================================
        System.out.println("\n26. strip()");
        System.out.println("   Java   ".strip());

        // ==========================================================
        // 27. matches()
        // Checks against Regular Expression.
        // ==========================================================
        System.out.println("\n27. matches()");
        System.out.println("12345".matches("\\d+"));

        // ==========================================================
        // 28. intern()
        // Returns String from String Pool.
        // ==========================================================
        System.out.println("\n28. intern()");
        String s1 = new String("Java");
        String s2 = s1.intern();
        System.out.println(s2);

        // ==========================================================
        // 29. hashCode()
        // Returns hash code of String.
        // ==========================================================
        System.out.println("\n29. hashCode()");
        System.out.println(str.hashCode());

        // ==========================================================
        // 30. toString()
        // Returns same String object.
        // ==========================================================
        System.out.println("\n30. toString()");
        System.out.println(str.toString());
    }
}