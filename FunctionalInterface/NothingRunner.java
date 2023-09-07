package FunctionalInterface;

public class NothingRunner {
    public static void main(String[] args) {
        Nothing n=()->{
            System.out.println("do something .");
        };
        n.something();
    }
}
