package ExceptionPackage;

public class ThrowsExce {
    public void data() throws NullPointerException
    {
//        String s="abc";
////        try {
//            String s=null;
//            System.out.println(s.length());
//        }catch(NullPointerException e)
//        {
//            e.printStackTrace();
//        }
String s=null;
        System.out.println(s.length());


    }
    public void data1() throws NullPointerException
    {
        data();
        System.out.println("hai");
    }
    public void data2() throws NullPointerException
    {
        data1();
        System.out.println("helloo");
    }

    public static void main(String[] args) {
        ThrowsExce c=new ThrowsExce();
        c.data2();
    }
}
