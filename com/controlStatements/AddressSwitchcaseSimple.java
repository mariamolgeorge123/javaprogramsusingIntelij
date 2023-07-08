package com.controlStatements;

import java.util.Scanner;

public class AddressSwitchcaseSimple {
    public static void main(String[] args) {
        System.out.println("Address");
        System.out.println("**********");
        Scanner sc=new Scanner(System.in);


        System.out.println("Pragra");
        System.out.println("CN Tower");
        System.out.println("Aquarium");
       ;
        System.out.println("Enter the place do you want?");
        String place=sc.next();

        switch(place)
        {
            case "Pragra":
                System.out.println("Address of Pragra is  : 110 Matheson Blvd W #160, Mississauga, ON L5R 4G7");
                break;
            case "CN Tower":
                System.out.println("Address of CN Tower is  : 290 Bremner Blvd, Toronto, ON M5V 3L9");
                break;
            case "Aquarium":
                System.out.println("Address of Aquarium is  : 288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

            default:
                System.err.println("Invalid");
                break;
        }

    }
}
