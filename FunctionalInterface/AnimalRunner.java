package FunctionalInterface;

public class AnimalRunner {
    public static void main(String[] args) {
//        Animal a=()->{
//            System.out.println("Animal is sleeping");
//        };
//        animalCall(a);



        animalCall(() -> { System.out.println("Animal is sleeping"); });

    }

    public  static void animalCall(Animal al)
    {
        System.out.println("call animal");
    }
}
