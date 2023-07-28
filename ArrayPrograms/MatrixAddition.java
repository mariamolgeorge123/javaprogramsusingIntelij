package ArrayPrograms;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int row=sc.nextInt();
        System.out.println("Enter number of column");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter Data for first array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("first array is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }

        System.out.println("*************************");

        int[][] arr1=new int[row][col];
        System.out.println("Enter Data for second array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second array is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("*********************");
        System.out.println("sum of first array and second array");
        int[][] arr3=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr3[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Result array is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println(" ");
        }


    }
}
