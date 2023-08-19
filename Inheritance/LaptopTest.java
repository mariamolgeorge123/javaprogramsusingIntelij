package Inheritance;
class Laptop
{
   String brand;
   String processor;
//Laptop()
//{
//
//}
    public Laptop(String brand, String processor) {
        this.brand = brand;
//        this.brand = "hp";
        this.processor = processor;
    }
    public void data()
    {
        System.out.println("this is parent class");
    }
}
class Dell extends Laptop{
    String screenSize;

    public Dell(String brand, String processor, String screenSize) {
        super(brand, processor);

        this.screenSize = screenSize;
    }

    public void createDell()
    {
//        System.out.println("brand  "+super.brand+"processor  "+processor+"screensize  "+screenSize);
        super.data();
        System.out.println("brand  "+brand+"  processor  "+processor+"  screensize  "+screenSize);
    }
}
public class LaptopTest {
    public static void main(String[] args) {
        Dell d=new Dell("Apple","i3","2000");
        d.createDell();

    }
}
