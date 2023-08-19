package InnerStaticClass;

public class Bottle {
    public static void data3()
    {
        System.out.println("it contain water");
    }
    static class Water
    {
        public void data()
        {
            System.out.println("it contain water");
        }
        public static void data1()
        {
            System.out.println("it contain water");
        }
    }
}
class Test
{
    public static void main(String[] args) {
        Bottle.Water w1=new Bottle.Water();
        Bottle.data3();
        w1.data();
        Bottle.Water.data1();

    }
}
