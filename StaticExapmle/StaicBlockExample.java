package StaticExapmle;

public class StaicBlockExample {
    StaicBlockExample()
    {
        System.out.println("constructor");
    }
    {  //this is instance intilization block.it called when instance created
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
