package AssisgnmentControlStatements;

import java.util.Scanner;

public class calculatordowhile {

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

            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Select the Operation do you want?");
            int oper = sc.nextInt();

            switch (oper) {
                case 1:
                    System.out.println("Result Addition :" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result Subtraction :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result Multiplication :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Result Division :" + (num1 / num2));
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
