package com.hky.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer>  mapTest=new HashMap<>();
        mapTest.put("Hare",34);
        mapTest.put("Sujeet",32);
        mapTest.put("Anoj",33);
        mapTest.put("Sanjay",35);
        mapTest.put("Sanjeev",26);
        mapTest.put("Kaple",31);
        System.out.println("mapTest:::"+mapTest);
        for (Map.Entry<String,Integer> map:mapTest.entrySet()){

            System.out.println("key::"+map.getKey()+"========"+"value:::"+map.getValue());


        }
        //Integer re = mapTest.remove("Sujeet");
        //System.out.println("remove::"+re);
        System.out.println("mapTest:::"+mapTest);
        boolean reWithValue = mapTest.remove("Sujeet", 32);
        System.out.println("mapTest:::"+mapTest);
        System.out.println("get::"+mapTest.get("Hare"));
        // mapTest.clear();
        //System.out.println("clear::"+mapTest);

    }

}
