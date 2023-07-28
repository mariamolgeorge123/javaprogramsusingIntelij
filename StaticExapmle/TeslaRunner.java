package StaticExapmle;

public class TeslaRunner {
    public static void main(String[] args) {
        Tesla t1=new Tesla();
        t1.Model="Model X";
        t1.color="white";
        t1.price=60000;
        Tesla.enginetype="electric";
        t1.car();
        Tesla.car1(t1);

        Tesla t2=new Tesla();
        t2.Model="Model Y";
        t2.color="white";
        t2.price=80000;
        Tesla.enginetype="electric";
        t2.car();
        Tesla.car1(t2);

        Tesla t3=new Tesla();
        t3.Model="Model z";
        t3.color="blue";
        t3.price=120000;
        Tesla.enginetype="electric";
        t3.car();
        Tesla.car1(t3);


    }
}
