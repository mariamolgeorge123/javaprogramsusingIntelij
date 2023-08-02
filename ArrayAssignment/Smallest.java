package ArrayAssignment;

import java.util.Scanner;

public class Smallest {
    int small;

    public void smallestElement(int[] ar) {
        small=ar[0];
        for (int i = 1; i < ar.length; i++) {

            if(small>ar[i])
            {
                small=ar[i];
            }
        }
        System.out.println("The smalest Value is : "+small);
    }


    public static void main(String[] args) {
        Smallest find = new Smallest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of tthe array?");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter the values");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }


        find.smallestElement(ar);
    }
}
