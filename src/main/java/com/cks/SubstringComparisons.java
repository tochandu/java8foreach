package com.cks;

/**
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 *
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
 */
public class SubstringComparisons {
    public static void main(String arg[]) {
        String str = "welcometojava";
        int k=3;
        String[] strList = new String[str.length()-2];
       for (int i=0;i <= str.length()-k;i++) {
           strList[i]=str.subSequence(i,k+i).toString();
       }

       

    }
}
