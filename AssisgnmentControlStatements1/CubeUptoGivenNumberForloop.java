package AssisgnmentControlStatements1;

import java.util.Scanner;

public class CubeUptoGivenNumberForloop {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cube=0;
        int i;
        for(i=1;i<=num;i++) {
            cube=i*i*i;
            System.out.println("Cube of "+i+" is "+cube);

        }
    }
}
