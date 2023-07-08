package com.controlStatements;

import java.util.Scanner;

public class CalculatorUsingSwitchcaseStiring {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value");
        int num1=sc.nextInt();
        System.out.println("Enter Second value");
        int num2=sc.nextInt();

        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.println("Select the Operation do you want?");
        String oper=sc.next();

        switch(oper)
        {
            case "Addition":
                System.out.println("Result Addition :"+(num1+num2));
                break;
            case "Subtraction":
                System.out.println("Result Subtraction :"+(num1-num2));
                break;
            case "Multiplication":
                System.out.println("Result Multiplication :"+(num1*num2));
                break;
            case "Division":
                System.out.println("Result Division :"+(num1/num2));
                break;
            default:
                System.err.println("Invalid");
                break;
        }

    }
}
