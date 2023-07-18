package AssignmentUsingMethods;

import java.util.Scanner;

class Multiply
{
    public void multiplication(int num)
    {
        int i=1;
        do
        {
            System.out.println(i+"*"+num+"="+(num*i));
            i++;
        }  while(i<=10);
    }
}
public class MultplicationTabledoWhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Multiply multiply=new Multiply();
        multiply.multiplication(num);

    }
}
