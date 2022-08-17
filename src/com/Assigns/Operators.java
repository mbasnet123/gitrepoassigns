package com.Assigns;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int number1 = in.nextInt();
        System.out.print("Enter num2: ");
        int number2 = in.nextInt();
        System.out.print("Enter op: ");
        char op = in.next().charAt(0);

        int sum = number1+number2;
        int difference = number1-number2;
        if(op=='+'){
            System.out.println("result = "+sum);
        }
        if(op=='-'){
            System.out.println("result = "+difference);
        }
        if(op=='*'){
            System.out.println("result = "+number1*number2);
        }
        if(op=='/'){
            System.out.println("result = "+number1/number2);
        }
    }
}
