package ArrayPrograms;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=scanner.nextInt();
        String[] fruitdata=new String[size];
        for(int j=0;j<fruitdata.length;j++)
        {
            System.out.println("Enter fruit");
            fruitdata[j]=scanner.next();
        }
        System.out.println("Fruits are:");

        System.out.println("**********print in for each**************");
        for (String s:fruitdata) {
            System.out.println(s);
        }


    }
}
