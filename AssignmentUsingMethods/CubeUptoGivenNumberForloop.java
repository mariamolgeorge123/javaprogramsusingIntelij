package AssignmentUsingMethods;

import java.util.Scanner;

    class AddMethod {
    public void cube(int num) {
        int cube = 0;
        int i;
        for (i = 1; i <= num; i++) {
            cube = i * i * i;
            System.out.println("Cube of " + i + " is " + cube);

        }
    }
}
public class CubeUptoGivenNumberForloop {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        AddMethod method=new AddMethod();
        method.cube(num);

    }
}
