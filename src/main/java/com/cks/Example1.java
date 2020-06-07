package com.cks;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String arg[]) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        //If we want to use functional-style Java, we can also use the forEach().
        // We can do so directly on the collection:
        list.forEach(item->{
            System.out.println(item);
        });
        System.out.println("-----------");
        //we can call forEach() on the collection's stream:
        list.stream().forEach(item->{
            System.out.println(item);
        });
    }
}
