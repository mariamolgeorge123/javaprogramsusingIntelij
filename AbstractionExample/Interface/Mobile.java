package AbstractionExample.Interface;

public class Mobile implements Telephone,Camera{
    @Override
    public void takepicture() {
        System.out.println("take picture");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take video");
    }

    @Override
    public void makecall() {
        System.out.println("make a call");
    }

    @Override
    public void makeMessage() {
        System.out.println("make a message");
    }

    @Override
    public void addData() {
        System.out.println("add data");
    }

    @Override
    public void calculateData() {
        System.out.println("calculate");
    }
}
