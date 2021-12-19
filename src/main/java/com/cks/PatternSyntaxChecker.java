package com.cks;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            //Write your code
            try {
                String pattern = in.nextLine();
                testCases--;
                Pattern.compile(pattern).pattern();
                System.out.println("Valid");
            }catch ( NoSuchElementException | PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
