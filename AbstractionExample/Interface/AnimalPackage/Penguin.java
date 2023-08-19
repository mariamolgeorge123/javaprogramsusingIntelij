package AbstractionExample.Interface.AnimalPackage;

public class Penguin implements AquaticAnimals,Animal{
    @Override
    public void swim() {
        System.out.println("penguin:swimming");
    }

    @Override
    public void feed() {
        System.out.println("penguin :: feeding");
    }

    @Override
    public void makeSound() {

        System.out.println("penguin::make sound");

    }
}
