package AssignmentUsingMethods;

import java.util.Scanner;

public class SumAndAverageofFiveInputdoWhileloop {
    public void average()
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        float average=0.0f;
        do {
            System.out.println("Enter the number");
            int number=sc.nextInt();
            sum+=number;
            i++;
        }while (i<=5);
        System.out.println("Sum of 5 numbers is "+sum);
        average=(float)sum/(float)5;
        System.out.println("Average of 5 numbers is "+average);

    }
    public static void main(String[] args) {
        SumAndAverageofFiveInputdoWhileloop data=new SumAndAverageofFiveInputdoWhileloop();
        data.average();
    }
}
