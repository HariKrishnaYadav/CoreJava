package com.hky.ds.array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght::");
        int n=sc.nextInt();
        int rollNo[] = new int[n];

        for(int i=0;i<rollNo.length;i++){
            System.out.print("Enter "+i+" element::");
            rollNo[i]= sc.nextInt();
            
        }
        printArray(rollNo);
    }

    private static void printArray(int[] rollNo) {
    for (int i=0;i<rollNo.length;i++){
        System.out.print(rollNo[i]+" ");
    }
    }
}
