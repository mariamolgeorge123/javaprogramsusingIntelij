package AssignmentUsingMethods;

import java.util.Scanner;

public class DisplayAndSumNaturalNumbersForloop {
    public void display(int limit)
    {
        int i;
        int sum=0;
        for(i=1;i<=limit;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Sum of "+limit+" natural number is "+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        DisplayAndSumNaturalNumbersForloop da=new DisplayAndSumNaturalNumbersForloop();
        da.display(limit);
        }
}
