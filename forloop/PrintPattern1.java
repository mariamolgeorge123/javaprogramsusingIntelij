package forloop;

import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int row=sc.nextInt();
        for(int i=row;i>=0;i--)
        {

            for(int space =0; space <row-i; space++) {
                System.out.print("  ");
            }

            for(int j=1;j<=i+(i-1);j++)
            {
                if(j%2==0) {
                    System.out.print("0");
                    System.out.print("\t");
                }
                else {
                    System.out.print("1");
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}
