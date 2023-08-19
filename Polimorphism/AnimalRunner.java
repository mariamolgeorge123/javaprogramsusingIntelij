package Polimorphism;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal an=new Cat();
        an.makeSound();

        Cat ct=new Cat();
        ct.makeSound();
        Dog dg=new Dog();
        dg.makeSound();


        Animal an1=new Dog();
        an1.makeSound();
    }
}
