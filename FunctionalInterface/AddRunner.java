package FunctionalInterface;

public class AddRunner {
    public static void main(String[] args) {
        Add d=(int a,int b)->{
            System.out.println(a+b);
        };
        d.add(3,4);

    }
}
