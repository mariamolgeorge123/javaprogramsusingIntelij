package com.controlStatements;

import java.util.Scanner;

public class Terneryoperator {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        String result=(num%2==0)?"even":"odd";
        System.out.println("Result is :"+result);


        int result1=(num>5)?1:0;
        System.out.println("Result is :"+result1);
    }
}
