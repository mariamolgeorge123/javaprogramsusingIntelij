package Test;

public class Dog implements Animal{

    @Override
    public void eating() {
        System.out.println("eating");
    }

    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }


}
