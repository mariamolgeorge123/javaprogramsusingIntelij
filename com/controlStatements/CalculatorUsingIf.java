package com.controlStatements;

import java.util.Scanner;

public class CalculatorUsingIf {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value");
        int num1=sc.nextInt();
        System.out.println("Enter Second value");
        int num2=sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Select the Operation do you want?");
        int oper=sc.nextInt();

        if(oper==1)
        {
            System.out.println("Result for Addition   :"+(num1+num2));
        }
        else if(oper==2)
        {
            System.out.println("Result for Subtraction   :"+(num1-num2));
        }
        else if(oper==3)
        {
            System.out.println("Result for Multiplication  :"+(num1*num2));
        }
        else if(oper==4)
        {
            System.out.println("Result for Division  :"+(num1/num2));
        }
        else {
            System.out.println("not a valid ");
        }


    }
}
