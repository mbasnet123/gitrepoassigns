package com.Assigns;

import java.util.Scanner;

public class ODDeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println(num + " is Even");}
            else{
                System.out.println(num + " is odd");
            }
        }
    }
