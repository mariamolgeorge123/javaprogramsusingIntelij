package AbstractionExample.Interface.AnimalPackage;

public class Lion implements Animal {

    @Override
    public void feed() {
        System.out.println("lion feed by himself");
    }

    @Override
    public void makeSound() {
        System.out.println("lion roaring");
    }
}
