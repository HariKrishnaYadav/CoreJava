package com.hky.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int twoDArray[][]={{1,2,3,4},{5,6,7,8,9},{10,11,12,13}};
        //printing 2d array
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(twoDArray[i][j] + " ");
                System.out.println();


        }
    }
}
