package com.hky.leetcode.arrays;

public class IndexesOfSubarraySum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                if (sum == target) {
                    System.out.println("Indexes of subarray with given sum are: " + i + " and " + j);
                    found = true;
                    return; // Remove this if you want to find all subarrays
                }
            }
        }

        if (!found) {
            System.out.println("No subarray found.");
        }
    }
}
