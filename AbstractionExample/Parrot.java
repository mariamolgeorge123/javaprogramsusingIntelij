package AbstractionExample;

public class  Parrot extends BirdsAbstraction{
    public Parrot(int numberofLegs, int lifespan) {
        super(numberofLegs, lifespan);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void cry() {
        System.out.println("Parrot is crying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }
}
