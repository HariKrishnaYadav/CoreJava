package com.hky.leetcode.arrays;

import java.util.ArrayList;

public class SubarraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {

            sum += arr[end];

            // Shrink the window if sum exceeds target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            // Found the target sum
            if (sum == target) {
                result.add(start + 1); // 1-based index
                result.add(end + 1);   // 1-based index
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println(subarraySum(arr, target));
    }
}