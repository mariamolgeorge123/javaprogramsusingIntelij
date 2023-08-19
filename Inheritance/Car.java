package Inheritance;

public class Car extends Vehicle{
    String engineType;

    public Car(String color, int speed, String engineType) {
        super(color, speed);
        this.engineType = engineType;
    }

    public void display2()
    {
        System.out.println("color: "+color);
        System.out.println("speed: "+speed);
        System.out.println("speed: "+engineType);
    }

}
