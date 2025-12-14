package com.hky.arrays;

public class SubsetArray {
    public static void main(String[] args) {
        int[] a={3,4,5,6,7};
        int[] b={4,6};
        System.out.println(isSubset(a,b));
    }

    private static boolean isSubset(int[] a, int[] b) {
    boolean flag=true;
           for(int i=0; i<b.length;i++){
               for(int j=0;j<a.length;j++){
                   if(a[i]!=b[j]);
                   flag=false;
                   break;
               }
           }
        return flag;
    }


}
