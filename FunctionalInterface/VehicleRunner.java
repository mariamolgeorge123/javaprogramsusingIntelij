package FunctionalInterface;

public class VehicleRunner {
    public static void main(String[] args) {


        Vehicle v = (String s) -> {
            System.out.println("model is" + s);
        };
        v.run("bmw");
    }
}
