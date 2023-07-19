package StaticExapmle;

public class StaicBlockExample {
    static {
        System.out.println("satic block1");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
    static {
        System.out.println("satic block2");
    }
}
