package com.cks;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here
        List<String> res = new ArrayList<>();
        List<String> senderList = new ArrayList<>();
        List<String> reciList = new ArrayList<>();
        for (String str : logs){
            System.out.println(str.toString());
            String[] strLis =  str.toString().split(" ");
                if (strLis[0].equals(strLis[1])) {
                senderList.add(strLis[0]);
            } else {
                senderList.add(strLis[0]);
                reciList.add(strLis[1]);
            }
        }
        List<String> senderReciList = new ArrayList<>();
        senderReciList.addAll(senderList);
        senderReciList.addAll(reciList);

        Map<String, Integer> map = new HashMap<>();
        for (String temp: senderReciList) {
            Integer count = map.get(temp);
            map.put(temp,(count==null) ? 1: count +1);
        }
       // Map<String, Integer> mapsort = new TreeMap<>(map);
        map.forEach((K,V) -> System.out.println(K +":::::"+ V));
               map.entrySet().stream().forEach(
                pair -> {
                    if (pair.getValue() >= threshold ) {
                        res.add(pair.getKey());
                    }
                }
        );
        res.add("1000");
        res.add("77");
     List<String> sortedList = res.stream().map(Integer::valueOf)
             .sorted()
             .map(String::valueOf)
             .collect(Collectors.toList());

             //.sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

return res.stream().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        int threshold =2;
        List<String> logs = new ArrayList<>();
        logs.add("88 99 200");
        logs.add("88 99 300");
        logs.add("99 32 100");
        logs.add("12 12 15");
        List<String> result = test.processLogs(logs, threshold);

    }
}
