package com.cks;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SalesbyMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        
/*     int current = ar[0];
       int count =1;
       int res=0;
        for (int i=0; i<n;i++) {
                     if (count ==2) {
                         count =0;
                         res++;
                         break;
                     }

                }
            }
        }
        System.out.println(res);
*/
return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n=15;
       // int [] ar = {3,3};
       int [] ar = {6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};
       sockMerchant(n,ar);

   //     int[] dsmn= removeArrayElement(ar,2);
     //   System.out.println(Arrays.toString(dsmn));
    /*    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        System.out.println(ar);
        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }

    public static int[] removeArrayElement(int[] oddArray, int index) {
        if (oddArray == null || index < 0 || index >= oddArray.length) {
        return oddArray;
    }
        return IntStream.range(0, oddArray.length) .filter(i -> i != index)
            .map(i ->oddArray[i]).toArray();
    }
}
