package com.cks;

import java.util.ArrayList;
import java.util.List;

/**
 *  * Java 8 Stream example - List with forEach and Filter
 */
public class Example1 {
    public static void main(String arg[]) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        //If we want to use functional-style Java, we can also use the forEach().
        // We can do so directly on the collection:
        list.forEach(item->{ System.out.println(item); });

        //If condition
        System.out.println("-------if condition-------");
        list.forEach(item->{
            if("bb".equals(item))
                  System.out.println(item);
        });

        System.out.println("-----Loop in Stream------");
        //we can call forEach() on the collection's stream:
        list.stream().forEach(item->{ System.out.println(item); });

        //if condition using stream and filter
        System.out.println("-----Stream and filter------");

        list.stream()
                .filter(item -> "aa".equals(item))
                .forEach(item->{ System.out.println(item); });
    }
}
