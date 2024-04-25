package com.hky.arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // Error code indicating array is too small
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
            return -1; // Error code indicating no second largest element found
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 8, 3, 9,20};
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}

