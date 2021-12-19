package com.cks;

public class JavaStringReverse {

    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        String A=sc.next();*/
        /* Enter your code here. Print output to STDOUT. */
        String A = "abc";
        int strlen = A.length();
        char strmain[]= A.toCharArray();
        char res[] = new char[strlen];
        int k=0;
        for(int i =strlen-1; i>= 0 ;i--)
        {
            res[k]= strmain[i];
            k++;
        }
        String resverStr = String.valueOf(res);
           if(A.equals(resverStr))
               System.out.println(true);
           else
               System.out.println(false);
    }
}
