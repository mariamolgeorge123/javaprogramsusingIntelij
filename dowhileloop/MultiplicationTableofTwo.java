package dowhileloop;

import java.util.Scanner;

public class MultiplicationTableofTwo {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        do
        {
            System.out.println("2*"+i+"="+(num*i));
            i++;
        }while(i<=10);
    }
}
