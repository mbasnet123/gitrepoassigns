package com.Assigns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int leap_year = in.nextInt();

            if(leap_year%4==0){
                System.out.println("It's a leap year");
            }
            else{
                System.out.println("It's not a leap year");
            }
        }
    }
