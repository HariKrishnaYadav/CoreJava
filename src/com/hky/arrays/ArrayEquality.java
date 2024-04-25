package com.hky.arrays;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + isEqual);
    }
}

