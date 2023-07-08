package com.controlStatements;

import java.util.Scanner;

public class CalculatorUsingSwitchCaseOperator {

    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value");
        int num1=sc.nextInt();
        System.out.println("Enter Second value");
        int num2=sc.nextInt();

        System.out.println("+.Addition");
        System.out.println("-.Subtraction");
        System.out.println("*.Multiplication");
        System.out.println("/.Division");
        System.out.println("Select the Operation do you want?");
        char oper=sc.next().charAt(0);

        switch(oper)
        {
            case '+':
                System.out.println("Result Addition :"+(num1+num2));
                break;
            case '-':
                System.out.println("Result Subtraction :"+(num1-num2));
                break;
            case '*':
                System.out.println("Result Multiplication :"+(num1*num2));
                break;
            case '/':
                System.out.println("Result Division :"+(num1/num2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }

}
