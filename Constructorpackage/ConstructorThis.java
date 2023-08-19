package Constructorpackage;

class Mobile
{
    private String brand;
    private int capacity;

    private String color;
    Mobile()
    {

        System.out.println("hello inside default constructor");

    }
    Mobile(String brand,int capacity)
    {
        this();//refer to default constructor
        this.brand=brand;
        this.capacity=capacity;
    }
    Mobile(String brand,int capacity,String color)
    {
        this("Samsung",300);//call parameterized constructor
        this.brand=brand;
        this.capacity=capacity;
        this.color=color;
        this.printMobile();

    }
    public void printMobile()
    {
        System.out.println("Mobile: "+this.brand+"/"+capacity+"/"+this.color);
    }
}
public class ConstructorThis {
    public static void main(String[] args) {
        Mobile m=new Mobile("Apple",200);
        m.printMobile();

        Mobile m1=new Mobile("realmi",400,"red");
        m1.printMobile();

    }
}
