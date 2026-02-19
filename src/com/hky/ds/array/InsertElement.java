package com.hky.ds.array;


public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 8, 4, 7,9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        insert(arr, 5, 2);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insert(int[] arr, int i, int i1) {
        for (int j = arr.length - 1; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = i1;
    }
}

