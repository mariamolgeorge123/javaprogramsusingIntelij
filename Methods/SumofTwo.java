package Methods;

import java.util.Scanner;

public class SumofTwo {
    public static void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1+num2;

        System.out.println(sum);

    }
    public static void main(String[] args) {
        sum();

    }
}
