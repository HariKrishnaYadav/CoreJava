package com.hky.ds.array;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {3, 4, 20,2, 8, 4, 7,9,10};
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest::"+largest);
    }
}
