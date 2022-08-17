package com.Assigns;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = in.nextInt();

        for(int i =1; i<=15; ++i){
//           int product = number * i;
            System.out.printf("%d*%d=%d\n", number, i, number*i);
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
