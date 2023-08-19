package Inheritance;

public class Computer  {
    public String model;
    public String screenSize;

    public Computer(String model, String screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }
    public void printdetails()
    {

        System.out.println("computer details"+model);
    }
}
