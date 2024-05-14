package cmo.hky.java8.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamToIntegerArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 20, 10,2,7,3,8,3,7,3,7,3,7);
        Map<Integer, Integer> map = new HashMap<>();
        int count=1;
        for (Integer l : list) {

            if (map.containsKey(l)) {

                //map.put(l, l.intValue()+1);
                map.put(l, count+1);
            } else {
                map.put(l, 1);
            }

        }
        for(Map.Entry<Integer,Integer> l:map.entrySet()){
            if(l.getValue()>1){
                System.out.print(l.getKey()+" ");
            }
        }
        System.out.println("=========filter==========");
        Integer[] arr = list.stream().filter(l -> l % 2 == 0 && l <30).toArray(Integer[]::new);
        for (Integer l:arr){
            System.out.println("even:"+l+" ");
        }
        System.out.println("=========map==========");
        Integer[] map1 = list.stream().map(l->l*2).toArray(Integer[]::new);
        for (Integer l:map1 ){
            System.out.println("Map:"+l+" ");
        }
    }

}
