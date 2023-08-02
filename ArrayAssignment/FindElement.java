package ArrayAssignment;

import java.util.Scanner;

public class FindElement {
    public void findElement(int[] ar,int element)
    {
//        for (int i:ar) {
//            if(i==element)
//            {
//                System.out.println("Element found");
//            }


        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]==element)
            {
                System.out.println("element found in the position "+i);
            }
//            else
//            {
//                System.out.println("searched element not in this array");
//            }
        }
    }
    public static void main(String[] args) {
        FindElement find=new FindElement();
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
        int element=sc.nextInt();
        find.findElement(ar,element);


    }
}
