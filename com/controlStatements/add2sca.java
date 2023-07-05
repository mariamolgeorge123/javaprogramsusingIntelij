package com.controlStatements;

import java.util.Scanner;

public class add2sca {
    public static void main(String[] args) {
        int x,y,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:  ");
        x=sc.nextInt();
        System.out.println("Enter second number:  ");
        y=sc.nextInt();
        sum=x+y;
        System.out.println("Sum is:  "+sum);

    }
}
