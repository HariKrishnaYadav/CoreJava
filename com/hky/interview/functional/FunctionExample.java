package com.hky.interview.functional;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // 1. Basic Function: Takes a String, returns its length (Integer)
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java")); // Output: 4

        // 2. Chaining Functions using andThen() and compose()
        Function<Integer, Integer> multiplyByTwo = num -> num * 2;
        Function<Integer, Integer> addThree = num -> num + 3;

        // andThen: (x * 2) -> then result + 3. For 5: (5 * 2) + 3 = 13
        Function<Integer, Integer> mathSequence1 = multiplyByTwo.andThen(addThree);
        System.out.println("andThen result: " + mathSequence1.apply(5)); 

        // compose: (x + 3) -> then pass result to multiplyByTwo. For 5: (5 + 3) * 2 = 16
        Function<Integer, Integer> mathSequence2 = multiplyByTwo.compose(addThree);
        System.out.println("compose result: " + mathSequence2.apply(5)); 
    }
}
