package com.hky.ds.array;

public class SmallestAndSecondsmallest {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 8, 4, 7,9,10};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println("smallest::"+smallest);
        System.out.println("secondSmallest::"+secondSmallest);
    }
}
