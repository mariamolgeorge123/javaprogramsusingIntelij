package AssignmentUsingMethods;

import java.util.Scanner;
class DisplayData
{
    public void display(int  limit)
    {

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
public class DisplayAndSumNaturalNumbersWhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        DisplayData data=new DisplayData();
        data.display(limit);


    }
}
