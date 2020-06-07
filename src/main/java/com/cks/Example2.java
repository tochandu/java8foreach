package com.cks;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String arg[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ccc");
        map.put(4, "ddd");
        map.put(5, "eee");
        map.put(6, "fff");

        map.forEach((K, V) -> {
            System.out.println(K + "::" + V);
        });

        map.entrySet().stream().forEach(item -> {
            System.out.println(item.getKey() + "::" + item.getValue());
        });
    }
}
