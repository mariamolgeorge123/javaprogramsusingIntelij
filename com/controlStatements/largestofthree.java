package com.controlStatements;
import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
//        int num1=12;
//        int num2=14;
//        int num3=14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("larger number is:"+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("larger number is:"+num2);
        }
        else
        {
            System.out.println("larger number is:"+num3);
        }
    }

}
