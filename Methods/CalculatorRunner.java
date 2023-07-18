package Methods;

import java.util.Scanner;
import Methods.Calculator;

public class CalculatorRunner {


    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner sc=new Scanner(System.in);
        char limit;
        do {
            System.out.println("Enter First value");
            int num1 = sc.nextInt();
            System.out.println("Enter Second value");
            int num2 = sc.nextInt();
            System.out.println("Enter Third value");
            int num3 = sc.nextInt();
            System.out.println("Enter Fourth value");
            int num4 = sc.nextInt();

            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Select the Operation do you want?");
            int oper = sc.nextInt();

            switch (oper) {
                case 1:
                    System.out.println("Result Addition 2 parameters :" + Calculator.addition(num1,num2));
                    System.out.println("Result Addition 3 parameters :" + Calculator.addition(num1,num2,num3));//call addition method
                    System.out.println("Result Addition 4 parameters :" + Calculator.addition(num1,num2,num3,num4));
                    break;
                case 2:
                   ;
                    System.out.println("Result Addition :" + Calculator.subtraction(num1,num2));
                    break;
                case 3:

                    System.out.println("Result Addition :" + Calculator.multiplication(num1,num2));
                    System.out.println("Result Addition 3 parameter :" + Calculator.multiplication(num1,num2,num3));
                    System.out.println("Result Addition 4 parameter :" + Calculator.multiplication(num1,num2,num3,num4));

                    break;

                case 4:

                    System.out.println("Result Addition :" + Calculator.division(num1,num2));
                    break;
                default:
                    System.err.println("Invalid");
                    break;
            }
            System.out.println("do you want to exit?press y for yes press n for no");


            limit=sc.next().charAt(0);
        }while(limit!='y');

    }
}
