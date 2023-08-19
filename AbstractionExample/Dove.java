package AbstractionExample;

public class Dove extends BirdsAbstraction{
    public Dove(int numberofLegs, int lifespan) {
        super(numberofLegs, lifespan);
    }

    @Override
    public void fly() {
        System.out.println("Dove is flying");
    }

    @Override
    public void cry() {
        System.out.println("Dove is flying");
    }

    @Override
    public void eat() {
        System.out.println("Dove is flying");
    }
}
