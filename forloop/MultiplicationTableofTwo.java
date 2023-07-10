package forloop;

import java.util.Scanner;

public class MultiplicationTableofTwo {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println("2*"+i+"="+(num*i));

        }
    }
}
