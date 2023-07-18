package AssignmentUsingMethods;

import java.util.Scanner;

public class SumOddNaturalNumberUsingWhileLoop {
    public void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<2*limit)
        {

            if(i%2==1)
            {
                System.out.println(i);
                sum=sum+i;
            }

            i++;

        }
        System.out.println("sum of "+limit+" odd natural number is "+sum);

    }
    public static void main(String[] args) {
        SumOddNaturalNumberUsingWhileLoop sum=new SumOddNaturalNumberUsingWhileLoop();
        sum.sum();

    }
}
