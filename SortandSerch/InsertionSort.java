package SortandSerch;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] ar)
    {
        int len=ar.length;
        for(int i=1;i<len;i++)
        {
            int key=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>key)
            {
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int limit=sc.nextInt();
        int ar[]=new int[limit];
        System.out.println("enter values");
        for(int i=0;i<limit;i++)
        {
            ar[i]=sc.nextInt();
        }
        InsertionSort b=new InsertionSort();
        b.insertionSort(ar);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(ar));
    }
}
