package com.Assigns;

import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = in.nextFloat();
        System.out.println("Value in USD= "+value/120);
    }
}
