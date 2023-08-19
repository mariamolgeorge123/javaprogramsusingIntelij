package InnerClassExample;

public class OutClassRunner {
    public static void main(String[] args) {
        OutClass out=new OutClass();
        out.printData();
       OutClass.InClasss in=out.new InClasss();
        in.age=20;
        in.printAge();

    }
}
