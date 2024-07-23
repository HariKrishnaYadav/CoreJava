package com.hky.leetcode.array;

import java.util.Arrays;

public class SecondSmallNo {
    public static void main(String[] args) {
        int[] arr={-5,4,7,2,8,1,};
       int min=arr[0];
        int secMin=arr[1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];

            }

        }
        System.out.println(min+"   "+secMin);


    }
}
