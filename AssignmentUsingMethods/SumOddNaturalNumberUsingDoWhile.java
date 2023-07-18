package AssignmentUsingMethods;

import java.util.Scanner;

public class SumOddNaturalNumberUsingDoWhile {
    public void sum(int limit)
    {
        int i=1;
        int sum=0;
        do {

            if(i%2==1)
            {
                sum=sum+i;
                System.out.println(i);
            }

            i++;


        }while (i<2*limit);
        System.out.println("sum of "+limit+" odd natural number is "+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        SumOddNaturalNumberUsingDoWhile sum=new SumOddNaturalNumberUsingDoWhile();
        sum.sum(limit);
        }
}
