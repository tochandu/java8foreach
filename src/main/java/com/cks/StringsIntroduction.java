package com.cks;

public class StringsIntroduction {
    public static void main(String arg[]) {
        String str ="hello word";
        String[] arryStr=str.split(" ");
        getUppString("hello","word");
    }

    public static void getUppString(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();

        System.out.println(lenA+lenB);

        String capA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capB = B.substring(0,1).toUpperCase()+B.substring(1);
        if(0 > A.compareTo(B)) {
            System.out.println("No");
           // System.out.println(capA +" "+capB);
        } else
        {
            System.out.println("Yes");
           // System.out.println(capB +" "+capA);
        }
        System.out.println(capA +" "+capB);
    }
}
