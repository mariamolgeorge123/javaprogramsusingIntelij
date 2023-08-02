package StringAssignment;

import java.util.Scanner;

public class StringtoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        String data=sc.nextLine();
        char[] ch=data.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }
    }
}
