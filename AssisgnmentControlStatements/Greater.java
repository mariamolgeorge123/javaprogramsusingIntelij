package AssisgnmentControlStatements;
import java.util.*;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char limit;
        do {
            System.out.println("Enter first number");
            int num1=sc.nextInt();
            System.out.println("Enter Second number");
            int num2=sc.nextInt();
            System.out.println("Enter Third number");
            int num3=sc.nextInt();
            if(num1>num2 && num1>num3)
            {
                System.out.println("Greater number is"+num1);
            }
            else if(num2>num1 && num2>num3)
            {
                System.out.println("Greater number is"+num2);
            }
            else if(num3>num1 && num3>num2)
            {
                System.out.println("Greater number is"+num3);
            }
            else if(num1==num2 && num1==num3)
            {
                System.out.println("all numbers are equal");
            }
            else {
                System.out.println("Invalid number");
            }
            System.out.println("do you want to exit?press y for yes press n for no");


            limit=sc.next().charAt(0);
        }while(limit!='y');

    }
}
