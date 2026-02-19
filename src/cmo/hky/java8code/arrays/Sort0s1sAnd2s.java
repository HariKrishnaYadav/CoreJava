package cmo.hky.java8code.arrays;

import java.util.Arrays;
import java.util.List;

public class Sort0s1sAnd2s {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1, 2, 1, 0, 0, 1, 2, 1, 0);
        sortArrayAcendingOrder(list);
    }

    private static void sortArrayAcendingOrder(List<Integer> list) {
        int low=0;
        int mid=0;
        int high=list.size()-1;
        while (mid<=high){
            if(list.get(mid)==0){
                int temp=list.get(low);
                list.set(low,list.get(mid));
                list.set(mid,temp);
                low++;
                mid++;
            }else if(list.get(mid)==1){
                mid++;
            }else {
                int temp=list.get(high);
                list.set(high,list.get(mid));
                list.set(mid,temp);
                high--;
            }
        }
        System.out.println(list);
    }
}
