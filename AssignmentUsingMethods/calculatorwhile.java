package AssignmentUsingMethods;

import java.util.Scanner;
class AddMethods
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int divide(int a,int b)
    {
        return a/b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
}

public class calculatorwhile {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner sc = new Scanner(System.in);
        AddMethods ca=new AddMethods();
        char limit='n';
        while (limit != 'y') {


            System.out.println("Enter First value");
            int num1 = sc.nextInt();
            System.out.println("Enter Second value");
            int num2 = sc.nextInt();

            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Select the Operation do you want?");
            int oper = sc.nextInt();

            switch (oper) {
                case 1:
                    System.out.println("Result Addition :" +ca.add(num1,num2));
                    break;
                case 2:
                    System.out.println("Result Subtraction :" + ca.subtract(num1,num2));
                    break;
                case 3:
                    System.out.println("Result Multiplication :" + ca.multiply(num1,num2));
                    break;
                case 4:
                    System.out.println("Result Division :" + ca.divide(num1,num2));
                    break;
                default:
                    System.err.println("Invalid");
                    break;
            }
            System.out.println("do you want to exit?press y for yes press n for no");


            limit = sc.next().charAt(0);
        }

    }
}