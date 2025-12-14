package com.hky.basic.program;

public class Gcd {
    public static void main(String[] args) {
        int a=20;
        int b=28;
        System.out.println(gcd(a,b));
        System.out.println(gcdRecursive(a,b));
    }

    static int gcdRecursive(int a, int b) {
        return (b == 0) ? a : gcdRecursive(b,a%b);
    }



    private static int gcd(int a, int b) {
        int result=Math.max(a,b);
        while (result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
       return result;

    }
}
