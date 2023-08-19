package Test;

public class AbsImpl extends AbtractExa{
    @Override
    public void data1() {
        System.out.println("public");
    }

    @Override
    protected void data3() {
        System.out.println("protected");

    }

    @Override
    public void data4() {
        System.out.println("public void");
    }

    @Override
    public void data5() {
        System.out.println("public void");
    }

    public static void main(String[] args) {
        AbtractExa e=new AbsImpl();
        e.d1();
        e.data3();
        e.data1();
        e.data4();
        e.data5();
        AbtractExa.d2();
        AbtractExa.d3();
    }
}
