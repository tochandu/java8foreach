package com.cks;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       s= s.trim();
        if(s== null || s.isEmpty()) {
            System.out.println("0");
        } else {
            s = s.trim().replaceAll("[^A-Za-z !,?._'@]+,", " ");
            //  s = s.replaceAll("\\s+", " ");
            String[] str = s.split(" ");
            System.out.println(">>>>>>>>" + s);
            System.out.println(str.length);
            for (String s1 : str) {
                System.out.println("------" + s1 + "------------");
            }
        }
       // Write your code here.
        scan.close();

    }
}
