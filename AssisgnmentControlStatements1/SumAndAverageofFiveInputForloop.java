package AssisgnmentControlStatements1;

import java.util.Scanner;

public class SumAndAverageofFiveInputForloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int sum=0;
        float average=0.0f;
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter the number");
            int number=sc.nextInt();
            sum+=number;

        }
        System.out.println("Sum of 5 numbers is "+sum);
        average=(float)sum/(float)5;
        System.out.println("Average of 5 numbers is "+average);
    }
}
