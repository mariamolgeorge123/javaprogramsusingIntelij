package SortandSerch;

import java.util.Scanner;

public class SelectionSort {
    public void selectionSort(int[] ar)
    {
        int n=ar.length;
        int temp=0;
        for (int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(int k=0;k<ar.length;k++)
        {
            System.out.println(ar[k]);
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
        SelectionSort b=new SelectionSort();
        b.selectionSort(ar);
    }
}
