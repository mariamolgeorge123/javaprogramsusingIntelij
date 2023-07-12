package AssisgnmentControlStatements;

import java.util.Scanner;

public class MultplicationTableForloop {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+num+"="+(num*i));
        }

    }
}
