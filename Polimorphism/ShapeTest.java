package Polimorphism;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s=new Rectangle(5.0,2.0);
        System.out.println("Area of Rectangle"+s.getArea());

        Shape s1=new Circle(5.0);
        System.out.println("Area of Circle"+s1.getArea());

    }
}
