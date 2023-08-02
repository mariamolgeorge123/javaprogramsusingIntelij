package ArrayAssignment;

import java.util.Scanner;

public class ReverseArrayOtherMethod {
    public void reverseArray(int[] ar)
    {
        int mid,temp,len;
        len=ar.length;
        mid=(len-1)/2;
        for (int i = 0; i <=mid ; i++) {
            temp=ar[len-1-i];
            ar[len-1-i]=ar[i];
            ar[i]=temp;

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }
    }
    public static void main(String[] args) {
        ReverseArrayOtherMethod reverse=new ReverseArrayOtherMethod();
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
