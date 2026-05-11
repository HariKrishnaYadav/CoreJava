package com.hky.objects.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + isEqual);
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
            List<Integer> list2=Arrays.asList(1,2,3,4,5,6);
            System.out.println("list equals list2 :"+list.equals(list2));
    }
}

