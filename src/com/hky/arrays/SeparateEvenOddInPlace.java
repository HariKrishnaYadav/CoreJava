package com.hky.arrays;

import java.util.Arrays;

public class SeparateEvenOddInPlace {
    public static void main(String[] args) {
        int[] input = {1, 3, 45, 2, 67, 9,12,10};

        separateEvenOdd(input);

        System.out.println("Array after separating even and odd numbers:");
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    private static void separateEvenOdd(int[] input) {
       int left=0;
       int right=input.length-1;
       while (left<right){
           while (input[left]%2==0 && left<right){
               left++;
           }
           while (input[right]%2!=0 && left<right){
               right--;
           }
          if(left<right){
              int temp=input[left];
              input[left]=input[right];
              input[right]=temp;
              left++;
              right--;
          }
       }
    }
}