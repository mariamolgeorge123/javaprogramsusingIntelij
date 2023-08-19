package Test;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.walk();
        d.play();
        d.eating();
        d.love();
        Animal a=new Dog();
        a.eating();
        a.walk();
        a.play();
        a.love();
        Animal.cry();

    }
}
