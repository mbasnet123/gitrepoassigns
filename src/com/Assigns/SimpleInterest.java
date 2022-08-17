package com.Assigns;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P: ");
        int P = in.nextInt();
        System.out.print("Enter T: ");
        int T = in.nextInt();
        System.out.print("Enter I: ");
        int I = in.nextInt();
        System.out.println("SI="+P*T*I/100);
    }
}
