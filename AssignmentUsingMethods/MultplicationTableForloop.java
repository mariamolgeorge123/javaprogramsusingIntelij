package AssignmentUsingMethods;

import java.util.Scanner;

public class MultplicationTableForloop {
    public void multiply()
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+num+"="+(num*i));
        }
    }
    public static void main(String[] args) {

        MultplicationTableForloop multiply=new MultplicationTableForloop();
        multiply.multiply();

    }
}
