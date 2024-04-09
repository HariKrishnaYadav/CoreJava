package com.hky.maps;

import java.util.HashMap;

public class MapGoal {
    public static void main(String[] args) {
        HashMap<String,Integer> goalMap=new HashMap<>();
        goalMap.put("team1",1);
        goalMap.put("team2",1);
        System.out.println("goalMap::"+goalMap);
        System.out.println("add 1 goal::"+goalMap.put("team1",goalMap.get("team1")+1));
        System.out.println("without compute::"+goalMap);
        goalMap.compute("team2",(team,goal)->goal+1);
        System.out.println("with compute:::"+goalMap);
        goalMap.computeIfPresent("team1",(team,goal)->goal+1);
        System.out.println("compute with if present::"+goalMap);

    }
}
