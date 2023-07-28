//package SortandSerch;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class QuickSort {
//    public void quickSort(int[] ar,int l,int h)
//    {
//        if(l<h)
//        {
//            int mid=partion(ar,l,h);
//            quickSort(ar,l,mid);
//            quickSort(ar,mid+1,h);
//        }
//    }
//    public int partion(int[] ar,int l,int h)
//    {
//        int pivot=ar[l];
//        int i=l-1;
//        int j=h+1;
//        while(true) {
//            do {
//                i++;
//            } while (ar[i] < pivot);
//            do {
//                j--;
//            } while (ar[j] > pivot);
////            if (i < j) {
////
////                int temp=ar[i];
////                ar[i]=ar[j];
////                ar[j]=temp;
////            }
//            if(i>j)
//            {
//                return j;
//            }
//            int temp=ar[i];
//                ar[i]=ar[j];
//                ar[j]=temp;
//        }
//
////        int temp1=ar[j];
////        ar[j]=ar[l];
////        ar[l]=temp1;
////        return j;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter limit");
//        int limit=sc.nextInt();
//        int ar[]=new int[limit];
//        System.out.println("enter values");
//        for(int i=0;i<limit;i++)
//        {
//            ar[i]=sc.nextInt();
//        }
//        QuickSort b=new QuickSort();
//        int len=(ar.length)-1;
//        b.quickSort(ar,0,len);
//        System.out.println("sorted aray is");
//        System.out.println(Arrays.toString(ar));
//    }
//}



package SortandSerch;

        import java.util.Arrays;
        import java.util.Scanner;

public class QuickSort {
    public void quickSort(int[] ar, int l, int h) {
        if (l < h) {
            int mid = partition(ar, l, h);
            quickSort(ar, l, mid);
            quickSort(ar, mid + 1, h);
        }
    }

    public int partition(int[] ar, int l, int h) {
        int pivot = ar[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            } while (ar[i] < pivot);

            do {
                j--;
            } while (ar[j] > pivot);

            if (i >= j) {
                return j;
            }

            // Swap ar[i] and ar[j]
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int limit = sc.nextInt();
        int ar[] = new int[limit];
        System.out.println("Enter values:");
        for (int i = 0; i < limit; i++) {
            ar[i] = sc.nextInt();
        }
        QuickSort b = new QuickSort();
        int len = ar.length - 1;
        b.quickSort(ar, 0, len);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(ar));
    }
}
