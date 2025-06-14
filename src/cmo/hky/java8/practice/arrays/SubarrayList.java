package cmo.hky.java8.practice.arrays;


import java.util.ArrayList;
import java.util.List;

public class SubarrayList {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        List<List<Integer>> subarrays = getAllSubarrays(arr);
        //System.out.println(subarrays);
           printTargetArray(subarrays,9);
    }

    private static void printTargetArray(List<List<Integer>> subarrays, int i) {
          for(List<Integer> sub:subarrays){
              Integer sum=0;
              for(Integer num :sub){
                  sum += num;
                  if(sum.equals(i) && sub.size()==3){
                      System.out.println("sub::"+sub);
                  }
              }
          }
    }

    public static List<List<Integer>> getAllSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }
        }
        return result;
    }
}

