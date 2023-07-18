package AssisgnmentControlStatements1;

import java.util.Scanner;

public class SumOddNaturalNumbersUsingForloop {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        for(int i=1;i<2*limit;i++)
        {
            if(i%2==1)
            {
                sum=sum+i;
                System.out.println(i);
            }

        }
        System.out.println("sum of "+limit+" odd natural number is "+sum);

    }
}
