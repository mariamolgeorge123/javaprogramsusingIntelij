package ArrayPrograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int row=sc.nextInt();
        System.out.println("Enter number of column");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter Data");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }



    }
}
