package Polimorphism;

public class Circle extends Shape {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }
    public Double getArea()
    {
        return 3.14*radius;
    }

}
