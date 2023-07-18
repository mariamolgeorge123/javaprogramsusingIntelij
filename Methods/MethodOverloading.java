package Methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void printData(int age)
    {
        System.out.println("Age is "+age);
    }
    public static void printData(String name)
    {
        System.out.println("Name is "+name);
    }
    public static void printData(Float salary)
    {
        System.out.println("salary is "+salary);
    }
//    public static void printSalary(int salary)
//    {
//        System.out.println("salary is "+salary);
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your name");
        String name=sc.next();
        printData(name);

        System.out.println("Enter your Age");
        int age=sc.nextInt();
        printData(age);


//        System.out.println("Enter your value");
//        int salary=sc.nextInt();
//        printSalary(salary);

        System.out.println("Enter your Salary");
        Float data1=sc.nextFloat();
        printData(data1);

    }
}
