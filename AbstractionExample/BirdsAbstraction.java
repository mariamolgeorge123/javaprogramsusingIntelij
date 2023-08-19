package AbstractionExample;

public abstract class  BirdsAbstraction {
    int numberofLegs;
    int lifespan;

    public BirdsAbstraction(int numberofLegs, int lifespan) {
        this.numberofLegs = numberofLegs;
        this.lifespan = lifespan;
    }
    public void display()
    {
        System.out.println("Legs"+numberofLegs);
        System.out.println("LifeSpan"+lifespan);
    }

    public abstract void fly();
    public abstract void cry();
    public abstract void eat();

    public void playing()
    {
        System.out.println("birds like playing");
    }

}
