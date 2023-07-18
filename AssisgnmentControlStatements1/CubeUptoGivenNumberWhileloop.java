package AssisgnmentControlStatements1;

import java.util.Scanner;

public class CubeUptoGivenNumberWhileloop {
    public static void main(String[] args) {
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
