package AssisgnmentControlStatements1;

import java.util.Scanner;

public class DisplayAndSumNaturalNumbersWhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=limit)
        {
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println("Som of "+limit+" natural number is "+sum);
    }
}
