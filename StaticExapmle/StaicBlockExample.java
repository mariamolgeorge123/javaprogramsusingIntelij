package StaticExapmle;

public class StaicBlockExample {
    {
        System.out.println("satic block0");
    }
    static {
        System.out.println("satic block1");
    }

    public static void main(String[] args) {
        System.out.println("main");
        new StaicBlockExample();  //this is for call {} block
    }
    static {
        System.out.println("satic block2");
    }
}
