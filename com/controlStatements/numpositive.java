package com.controlStatements;

import java.util.Scanner;

public class numpositive {
    public static void main(String[] args) {
//        int num=-5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println("it is negative number");
        }
        else {
            System.out.println("it is positive number");
        }
    }
}
