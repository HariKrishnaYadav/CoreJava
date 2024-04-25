package com.hky.arrays;

public class SecondLargest1 {
    public static void main(String[] args) {
        int arr[]={3,4,8,2,5,6,7,17,30};
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }

    private static int findSecondLargest(int[] arr) {
        if(arr.length<2){
            System.out.println("Arrays should have at least 2 elements");
            return -1;

        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int num:arr){
            if (num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;

            }

        }
        return  secondLargest;
    }


}
