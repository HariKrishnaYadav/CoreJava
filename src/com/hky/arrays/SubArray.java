package com.hky.arrays;

import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};
        List<int[]> subs = getAllSubarrays(a);
        for (int[] sub : subs) {
            System.out.println(Arrays.toString(sub));
        }
    }

    // Returns all contiguous subarrays of arr
    public static List<int[]> getAllSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        if (arr == null)
            return result;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                result.add(Arrays.copyOfRange(arr, i, j + 1));
            }
        }
        return result;
    }
}
