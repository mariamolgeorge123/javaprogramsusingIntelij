package SortandSerch;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public void merge(int[] ar,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for (int i=0;i<n1;i++)
        {
            l[i]=ar[left+i];

        }
        for (int i=0;i<n2;i++)
        {
            r[i]=ar[mid+1+i];

        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2)
        {
            if(l[i]>r[j])
            {
                ar[k]=r[j];
                j++;
            }
            else {
                ar[k]=l[i];
                i++;
            }
            k++;
        }
        while(i<n1)
        {
            ar[k]=l[i];
            i++;
            k++;

        }
        while(i<n2){
            ar[k]=r[j];
            j++;
            k++;
        }

    }
    public void mergeSort(int[] ar,int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergeSort(ar,left,mid);
            mergeSort(ar,mid+1,right);
            merge(ar,left,mid,right);
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
        MergeSort b=new MergeSort();
        int len=(ar.length)-1;
        b.mergeSort(ar,0,len);
        System.out.println("sorted aray is");
        System.out.println(Arrays.toString(ar));
    }
}
