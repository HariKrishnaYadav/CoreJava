package cmo.hky.java8code.arrays;

import java.util.Arrays;
import java.util.List;

public class Sort0s1s2sAnd3s {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(0, 1, 3, 1, 0, 1, 3, 2, 1, 2, 0, 3, 0, 0, 1);
        sortAcending(list);
        System.out.println(list);
    }

    private static void sortAcending(List<Integer> list) {
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==0){
                count0++;
            }else if(list.get(i)==1){
                count1++;
            }else if(list.get(i)==2){
                count2++;
            }else if(list.get(i)==3){
                count3++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(count0>0){
                list.set(i,0);
                count0--;
            }else if(count1>0){
                list.set(i,1);
                count1--;
            }else if(count2>0){
                list.set(i,2);
                count2--;
            }else if(count3>0){
                list.set(i,3);
                count3--;
            }
        }
    }
}
