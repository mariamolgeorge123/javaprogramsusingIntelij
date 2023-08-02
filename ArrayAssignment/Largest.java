package ArrayAssignment;

import java.util.Scanner;

public class Largest {
    int large;
    public void largestElement(int[] ar)
    {
        large=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (large<ar[i])
            {
                large=ar[i];
            }

        }
        System.out.println("Largest value is: "+large);
    }

        public static void main(String[] args) {
            Largest find = new Largest();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of tthe array?");
            int size = sc.nextInt();
            int[] ar = new int[size];
            System.out.println("Enter the values");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }


            find.largestElement(ar);
        }
    }

