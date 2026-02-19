package com.hky.ds.array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        findSecondLargest(arr);
    }

    private static void findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest= arr[i];
            } else if (arr[i] > secondLargest ) {

                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i]>thirdLargest ){
                thirdLargest=arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else if( thirdLargest == Integer.MIN_VALUE){
            System.out.println("There is no third largest element.");
        }else {
            System.out.println("The third largest element is: " + thirdLargest);
        }
    }
}
