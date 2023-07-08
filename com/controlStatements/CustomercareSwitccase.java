package com.controlStatements;

import java.util.Scanner;

public class CustomercareSwitccase {
    public static void main(String[] args) {
        System.out.println("Customer Care");
        System.out.println("**********");
        System.out.println("Welcome");

Scanner sc=new Scanner(System.in);
        System.out.println("1.English");
        System.out.println("2.Malayalam");
        System.out.println("3.Hindi");

        System.out.println("Select the language do you want?");
        int oper=sc.nextInt();

        switch(oper)
        {
            case 1:
                System.out.println("ok .you can speak in english");
                break;
            case 2:
                System.out.println("ok .you can speak in malayalam");
                break;
            case 3:
                System.out.println("ok .you can speak in hindi");
                break;

            default:
                System.err.println("Invalid Input");
                break;
        }

    }
}
