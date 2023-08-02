package StringAssignment;

import java.util.Scanner;

public class SearchAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String data=sc.nextLine();
        System.out.println("Enter the letter to search");
        char c=sc.next().charAt(0);
        for (int i = 0; i <data.length() ; i++) {
            if(data.charAt(i)==c)
            {
                System.out.println("character "+c+"found at position: "+i);
            }

        }
    }
}
