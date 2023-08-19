package Polimorphism;

public class Rectangle extends Shape {
    Double height;
    Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }
    public Double getArea()
    {
        return height*width;
    }
}
