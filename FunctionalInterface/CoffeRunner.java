package FunctionalInterface;

public class CoffeRunner {
    public static void main(String[] args) {
        Coffee c = (String size, String type) -> {System.out.println("Size:: " + size + "Type:: " + type);
    };

}
}
