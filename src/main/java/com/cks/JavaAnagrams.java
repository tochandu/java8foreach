package com.cks;

import java.util.Arrays;
import java.util.Locale;

/**
 * Option 1 : sort the char and compare the both char
 * Option 2: store the in int array as char and post increment and decrement
 */
public class JavaAnagrams {
  private static int ASCII_CODE_RANGE =256;
    public static void main(String arg[]) {
        String strA ="anagram";
        String strB ="margana";

        char charA[] = strA.toLowerCase().toCharArray();
        char charB[] = strB.toLowerCase().toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);

        if(Arrays.equals(charA,charB))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        boolean ret = isAnagram(strA, strB);
        System.out.println("------");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    private static boolean isAnagram(String strA, String strB) {
        if (strA.length() != strB.length())
            return false;

        int count[] = new int[ASCII_CODE_RANGE];
        for (int i = 0; i < strA.length(); i++) {
            count[strA.toLowerCase(Locale.ROOT).charAt(i)]++;
            count[strB.toLowerCase(Locale.ROOT).charAt(i)]--;
        }
        for (int i = 0; i < ASCII_CODE_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
