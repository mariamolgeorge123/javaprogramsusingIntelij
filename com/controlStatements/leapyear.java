package com.controlStatements;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");;
        int year=sc.nextInt();
//        int year=2012;
        if(year%4==0)
        {
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
