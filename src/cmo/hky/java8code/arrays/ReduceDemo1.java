package cmo.hky.java8code.arrays;

import java.util.Arrays;

public class ReduceDemo1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
