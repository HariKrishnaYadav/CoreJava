package com.hky.Call.by.Value.in.Different.Scenarios;

public class ArrayExample {
    public static void modifyArray(int[] arr) {
        arr[0] = 42; // Modifies the array element
        arr = new int[]{7, 8, 9}; // Changes local reference only
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        modifyArray(myArray);
        System.out.println(myArray[0]); // Output: 42
    }
}

//Explanation: The method receives a copy of the array reference. Changes to the array’s elements are reflected outside the method, but reassigning the array reference affects only the local copy.