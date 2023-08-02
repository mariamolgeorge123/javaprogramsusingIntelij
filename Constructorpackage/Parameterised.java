package Constructorpackage;

import java.util.Scanner;

class LaptopData
{
    private String brandName;
    private String os;
    private int price;
    public LaptopData(String brandName,String os,int price)
    {
        this.brandName=brandName;
        this.os=os;
        this.price=price;
    }

    @Override
    public String toString() {
        return "LaptopData{" +
                "brandName='" + brandName + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Parameterised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of laptop");
        String name=sc.next();
        System.out.println("Enter OS of laptop");
        String os=sc.next();
        System.out.println("Enter price of laptop");
        int price=sc.nextInt();

        LaptopData ldata=new LaptopData(name,os,price);
        System.out.println(ldata);


    }
}
