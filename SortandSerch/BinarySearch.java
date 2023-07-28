package SortandSerch;

import java.util.Scanner;

public class BinarySearch {
    Scanner sc1=new Scanner(System.in);
    public void bubbleSort(int[] ar)
    {
        int n=ar.length;
        int temp=0;
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n-1;k++)
            {
                if(ar[k]>ar[k+1])
                {
                    temp=ar[k+1];
                    ar[k+1]=ar[k];
                    ar[k]=temp;
                }
            }
        }
        System.out.println("sorted array is");
        for(int m=0;m<ar.length;m++)
        {
            System.out.println(ar[m]);
        }
        System.out.println("Element to be search");
        int element=sc1.nextInt();
        binarySearch(ar,element);
    }

    public void binarySearch(int[] ar,int element)
    {



        int len=ar.length;
        int start=0;
        int end=len-1;

        while (start<=end) {
            int mid=(start+(end))/2;
            if (ar[mid] == element) {
                System.out.println("Element found in position" + mid);
                break;
            } else if (element > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
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
        BinarySearch b=new BinarySearch();
        b.bubbleSort(ar);

    }

}
