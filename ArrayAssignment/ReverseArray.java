package ArrayAssignment;

import java.util.Scanner;

public class ReverseArray {
    public void reverseArray(int[] ar)
    {
        for (int i = ar.length-1; i >=0 ; i--) {
            System.out.println(ar[i]);

        }
    }
    public static void main(String[] args) {
        ReverseArray reverse=new ReverseArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of tthe array?");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search?");

        reverse.reverseArray(ar);


    }
}
