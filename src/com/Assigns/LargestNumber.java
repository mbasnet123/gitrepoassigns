package com.Assigns;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println( num1 +" is greater");}
            else{
                System.out.println(num2 +" is greater");
            }
        }
    }
