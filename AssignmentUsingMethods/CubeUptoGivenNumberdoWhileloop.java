package AssignmentUsingMethods;

import java.util.Scanner;

public class CubeUptoGivenNumberdoWhileloop {
    public void cube()
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cube=0;
        int i=1;
        do {
            cube=i*i*i;
            System.out.println("Cube of "+i+" is "+cube);
            i++;
        }while(i<=num);
    }
    public static void main(String[] args) {
        CubeUptoGivenNumberdoWhileloop cb=new CubeUptoGivenNumberdoWhileloop();
        cb.cube();

    }
}
