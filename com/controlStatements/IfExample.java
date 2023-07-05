package com.controlStatements;

public class IfExample {
    public static void main(String[] args) {
//        int y=8;
//        int x=((y>10)?10:8);
//        System.out.println(x);
        int y=10;
        System.out.println("if statement*************************");
        if(y>=10)
        {
            System.out.println(y);
        }
        if(y<20)
        {
            System.out.println("y is less than 20");
        }
        if(y==10)
        {
            System.out.println("y is equal to 10");
        }

        System.out.println("if-else statement*************************");


        if(y>10)
        {
            System.out.println("greater than 10");
        }
        else {
            System.out.println("less than 10");

        }

        System.out.println("if-else statement*************************");
        int x1=10;
        int y1=20;
        if((x1+y1<15)&&(x1*y1>10)&&(x1==10))
        {
            System.out.println("it is satisfied");
        }
        else {
            System.out.println("it is not satisfied");
        }
    }
}
