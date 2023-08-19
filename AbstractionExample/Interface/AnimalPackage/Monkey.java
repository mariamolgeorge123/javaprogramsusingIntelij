package AbstractionExample.Interface.AnimalPackage;

public class Monkey implements ClimbAnimal,Animal{
    @Override
    public void climb() {
        System.out.println("monkey::climbing");
    }

    @Override
    public void feed() {
        System.out.println("Monkey:: feeding");
    }

    @Override
    public void makeSound() {
        System.out.println("monkey::make sound");
    }
}
