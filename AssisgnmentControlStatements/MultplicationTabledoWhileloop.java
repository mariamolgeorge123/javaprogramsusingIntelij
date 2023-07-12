package AssisgnmentControlStatements;

import java.util.Scanner;

public class MultplicationTabledoWhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=1;
      do
        {
            System.out.println(i+"*"+num+"="+(num*i));
            i++;
        }  while(i<=10);
    }
}
