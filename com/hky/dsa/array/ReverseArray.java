package com.hky.dsa.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void reverseArray(int[] numbers) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex) {
            int temp = numbers[leftIndex];
            numbers[leftIndex] = numbers[rightIndex];
            numbers[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}
