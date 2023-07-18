package AssignmentUsingMethods;

import java.util.Scanner;

public class MultplicationTableWhileloop {
    public void multiply(int num)
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i+"*"+num+"="+(num*i));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        MultplicationTableWhileloop multiply=new MultplicationTableWhileloop();
        multiply.multiply(num);

    }
}
