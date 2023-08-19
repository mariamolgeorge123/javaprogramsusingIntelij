package AbstractionExample;

public class BirdRunner {
    public static void main(String[] args) {
        Dove d=new Dove(2,100);
        d.fly();
        d.cry();
        d.eat();
        d.playing();
        d.display();

//        Parrot p=new Parrot();
        BirdsAbstraction p=new Parrot(2,50);
        p.fly();
        p.cry();
        p.eat();
    }
}
