package FunctionalInterface;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture f=(String shape)->{
            System.out.println("shape of furniture is"+shape);
        };
        f.size("round");
    }
}
