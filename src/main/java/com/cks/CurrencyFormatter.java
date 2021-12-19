package com.cks;

import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
 */
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment =new Double(12345.555); //scanner.nextDouble();
        scanner.close();

        // Write your code here.

        System.out.println("US: " + getCurrencyFormat(Locale.US,payment));
        System.out.println("India: " + getCurrencyFormat(new Locale("en", "IN"),payment));
        System.out.println("China: " + getCurrencyFormat(Locale.CHINA,payment));
        System.out.println("France: " + getCurrencyFormat(Locale.FRANCE,payment));
    }

    private static String getCurrencyFormat(Locale locale,Double payment) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(payment);
    }
}
