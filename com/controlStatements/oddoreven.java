package com.controlStatements;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
//        int num=3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        if(num%2==0)
        {
         System.out.println("it is an even number");
        }
        else {
            System.out.println("it is an odd number");
        }
    }
}

