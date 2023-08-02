package Constructorpackage;

class Laptop
{
    private String brandName;
    private String os;
    private int price;
    public Laptop()
    {
        brandName="apple";
        os="ios";
        price=100000;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }
}
public class DefaultExample {
    public static void main(String[] args) {
Laptop l=new Laptop();
        System.out.println(l);
    }
}
