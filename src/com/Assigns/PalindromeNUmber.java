package com.Assigns;

import java.util.Scanner;

public class PalindromeNUmber {
    public static void main(String[] args) {
        int reversedNum = 0, remainder;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= in.nextInt();

        int originalNum = num;

        while (num!=0){
            remainder= num%10;
            reversedNum = reversedNum*10+remainder;
            num/=10;
        }

        if(originalNum==reversedNum){
            System.out.println(originalNum + " is Palindrome");
        }
        else {
            System.out.println(originalNum + " is not Palindrome");
        }

    }
}
