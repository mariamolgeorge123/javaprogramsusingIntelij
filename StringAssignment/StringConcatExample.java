package StringAssignment;

import java.util.Scanner;

public class StringConcatExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String str1=sc.nextLine();
        System.out.println("Enter second String");
        String str2=sc.nextLine();
        System.out.println(str1.concat(str2));

    }
}
