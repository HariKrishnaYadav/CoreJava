package com.hky.dsa.array;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = findSubarrayWithSum(arr, target);
    }

    private static int[] findSubarrayWithSum(int[] arr, int target) {

        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                return new int[]{start, end};
            }
        }

        return new int[]{-1, -1}; // No subarray found
    }
}
