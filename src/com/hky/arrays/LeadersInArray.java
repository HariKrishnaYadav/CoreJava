package com.hky.arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {13, 8, 7, 9, 2, 1, 3};
        findLeaders(arr);
    }

    static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];

            // The rightmost element is always a leader
        System.out.print(maxFromRight + " ");

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

