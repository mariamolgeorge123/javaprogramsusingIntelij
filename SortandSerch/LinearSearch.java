package SortandSerch;

import java.util.Scanner;

public class LinearSearch {

//    public void bubbleSort(int[] ar)
//    {
//        int n=ar.length;
//        int temp=0;
//        for(int j=0;j<n;j++)
//        {
//            for(int k=0;k<n-1;k++)
//            {
//                if(ar[k]>ar[k+1])
//                {
//                    temp=ar[k+1];
//                    ar[k+1]=ar[k];
//                    ar[k]=temp;
//                }
//            }
//        }
//        System.out.println("sorted array is");
//        for(int m=0;m<ar.length;m++)
//        {
//            System.out.println(ar[m]);
//        }
//
//    }
    public void linearSearch(int[] ar,int element)
    {


        int len=ar.length;

        for(int i=0;i<len;i++)
        {
            if(ar[i]==element)
            {
                System.out.println("element is found at  position   "+i);
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
        LinearSearch b=new LinearSearch();
//        b.bubbleSort(ar);
        System.out.println("Element to be search?");
        int element=sc.nextInt();
        b.linearSearch(ar,element);
    }

}
