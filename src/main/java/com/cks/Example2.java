package com.cks;

import java.util.HashMap;
import java.util.Map;

/**
 * Java 8 Stream example - Map with forEach and Filter
 */
public class Example2 {
    public static void main(String arg[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ccc");
        map.put(4, "ddd");
        //If we want to use functional-style Java, we can also use the forEach().
        // We can do so directly on the collection:
        map.forEach((K, V) -> { System.out.println(K + "::" + V); });
        //If condition
        System.out.println("-------if condition-------");
        map.forEach((K, V) -> {
            if("bbb".equals(V))
            System.out.println(K + "::" + V);
        });
        System.out.println("--------------");
        //we can call forEach() on the collection's stream:
        map.entrySet().stream().forEach(item -> {
            System.out.println(item.getKey() + "::" + item.getValue());
        });
        //if condition using stream and filter
        System.out.println("-----Stream and filter------");
        map.entrySet().stream()
                .filter(tmp -> "aaa".equals(tmp.getValue()))
                .forEach(item -> {
            System.out.println(item.getKey() + "::" + item.getValue());
        });
    }
}
