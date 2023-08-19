package Test;

public abstract class AbtractExa {
    public abstract void data1();

    protected abstract void data3();
    public abstract void data4();
    abstract void data5();
    public void d1()
    {
        System.out.println("public void");
    }
    public static void d2()
    {
        System.out.println("public static void");
    }
    public static final void d3()
    {
        System.out.println("public static final");
    }
    private void d4()
    {
        System.out.println("private void");
    }

}
