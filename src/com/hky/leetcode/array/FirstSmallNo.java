package com.hky.leetcode.array;

public class FirstSmallNo {
    public static void main(String[] args) {
        int[] arr={3,4,7,2,8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("mini::"+min);
    }
}
