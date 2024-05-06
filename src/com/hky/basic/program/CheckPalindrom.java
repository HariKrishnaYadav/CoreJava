package com.hky.basic.program;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: :");
        String str = sc.nextLine().replaceAll("^a-zA-Z0-9", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        boolean status=false;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
               status=false;
            }else {
                status=true;
            }
            left++;
            right--;
        }
        if(status){
            System.out.println(str+" ->is palindrom.");
        }else {
            System.out.println(str+" ->is not palindrom.");
        }
    }
}
