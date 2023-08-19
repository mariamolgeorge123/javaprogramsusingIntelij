package StaticExapmle;

public class StaticExa1Runner {
    int x1=30;
    static int y1=20;
    public  static void data2()
    {
        StaicExa1.y=20;
        System.out.println("this is data2");
        StaticExa1Runner e=new StaticExa1Runner();
        System.out.println(" non static  X1 ::"+e.x1);
        System.out.println("  static  Y1 ::"+StaticExa1Runner.y1);
    }
    public void data3()
    {
      StaticExa1Runner.data2();
      StaicExa1.data();
      StaicExa1 e=new StaicExa1();
      e.data4();

        System.out.println("this is data3");
    }
    public static void main(String[] args) {
        StaicExa1.data();
        StaticExa1Runner.data2();
        StaticExa1Runner s=new StaticExa1Runner();

        s.data3();
        StaicExa1 x=new StaicExa1();
        System.out.println("x:: "+x.x);
        System.out.println("Y::"+StaicExa1.y);

    }
}
