package ArrayPrograms;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] a={20,22,24,25};
//                System.out.println(a);//print memory location
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
//                   System.out.println(a[4]);//exception
        System.out.println(a.length);

        System.out.println("**********************");
        int num[]=new int[10];
        System.out.println(num[0]);// value is zero.because default value of int is 0
        num[0]=20;
        num[1]=30;
        num[2]=22;
        num[3]=23;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
    System.out.println(num[2]);

        System.out.println("**********************");


        String Fruits[]=new String[10];
        System.out.println(Fruits[0]);// value is null.because default value of String is null
        Fruits[0]="Apple";
        Fruits[1]="Orange";
        Fruits[2]="Grapes";
        Fruits[3]="Kiwi";
        System.out.println(Fruits[0]);
        System.out.println(Fruits[1]);
        System.out.println(Fruits[2]);
        System.out.println(Fruits[3]);

        System.out.println("**********************");


        Float a1[]=new Float[10];
        System.out.println(a[0]);// value is null.because default value of String is null
        a1[0]=1.1f;
        a1[1]=2.1f;
        a1[2]=1.4f;
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);


        System.out.println("**********************");
        Double b[]=new Double[10];
        System.out.println(a[0]);// value is null.because default value of String is null
        b[0]=1.1;
        b[1]=2.1;
        b[2]=1.4;
        for(int i=0;i<3;i++) {
            System.out.println(b[i]);
        }
        System.out.println("**********************");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=scanner.nextInt();
        String[] fruitdata=new String[size];
        for(int j=0;j<fruitdata.length;j++)
        {
            System.out.println("Enter fruit");
            fruitdata[j]=scanner.next();
        }
        System.out.println("Fruits are:");
        for(int j=0;j<fruitdata.length;j++)
        {
            System.out.println(fruitdata[j]);

        }
        System.out.println("**********print in for each**************");
        for (String s:fruitdata) {
            System.out.println(s);
        }


    }
}
