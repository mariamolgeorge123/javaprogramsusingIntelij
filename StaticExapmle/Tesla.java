package StaticExapmle;

public class Tesla {
    String Model;
    String color;
    int price;
    static String enginetype;
    public void car()
    {
        System.out.println(Model+" :"+color+" "+price+" "+enginetype);
    }
    public static void car1(Tesla t1)
    {
        System.out.println(t1.Model+" :"+t1.color+" "+t1.price+" "+enginetype);
    }
    public static void main(String[] args) {
        Tesla t1=new Tesla();
        t1.Model="Model X";
        t1.color="white";
        t1.price=60000;
        enginetype="electric";
        t1.car();
       car1(t1);

        Tesla t2=new Tesla();
        t2.Model="Model Y";
        t2.color="white";
        t2.price=80000;
        enginetype="electric";
        t2.car();
        car1(t2);

        Tesla t3=new Tesla();
        t3.Model="Model z";
        t3.color="blue";
        t3.price=120000;
        enginetype="electric";
        t3.car();
        car1(t3);


    }
}
