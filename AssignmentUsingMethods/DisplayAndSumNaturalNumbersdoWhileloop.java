package AssignmentUsingMethods;

import java.util.Scanner;

public class DisplayAndSumNaturalNumbersdoWhileloop {
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        int i=1;
        int sum=0;
        do {
            System.out.println(i);
            sum+=i;
            i++;
        }while(i<=limit);
        System.out.println("Sum of "+limit+" natural number is "+sum);
    }
    public static void main(String[] args) {
        DisplayAndSumNaturalNumbersdoWhileloop sum=new DisplayAndSumNaturalNumbersdoWhileloop();
        sum.display();
    }
}
