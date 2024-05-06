package com.hky.maps;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMaps {
    public static void main(String[] args) {
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "ferrari");
        System.out.println(identityHashMap);
    }
}
