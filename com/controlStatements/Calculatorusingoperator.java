package com.controlStatements;

import java.util.Scanner;

public class Calculatorusingoperator {

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

        if(oper=='+')
        {
            System.out.println("Result for Addition   :"+(num1+num2));
        }
        else if(oper=='-')
        {
            System.out.println("Result for Subtraction   :"+(num1-num2));
        }
        else if(oper=='*')
        {
            System.out.println("Result for Multiplication  :"+(num1*num2));
        }
        else if(oper=='/')
        {
            System.out.println("Result for Division  :"+(num1/num2));
        }
        else {
            System.out.println("not a valid ");
        }


    }
}
