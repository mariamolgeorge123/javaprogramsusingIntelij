package AssignmentUsingMethods;

import java.util.Scanner;


class AddMethod1
{
    public void cube()
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cube=0;
        int i=1;
        while(i<=num) {
            cube=i*i*i;
            System.out.println("Cube of "+i+" is "+cube);
            i++;
        }
    }
}

public class CubeUptoGivenNumberWhileloop {
    public static void main(String[] args) {
        AddMethod1 am=new AddMethod1();
        am.cube();

    }
}
