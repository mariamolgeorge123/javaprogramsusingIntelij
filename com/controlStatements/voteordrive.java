package com.controlStatements;
import java.util.Scanner;
public class voteordrive {
    public static void main(String[] args) {
//        int age=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age>=16&&age<18)
        {
            System.out.println("you have to take learners");
        }
        else if(age>=18)
        {
            System.out.println("you have to take licence");
        }
        else if(age<16){
            System.out.println("not eligible ");
        }
        else {
            System.out.println("invalid ");
        }
    }
}
