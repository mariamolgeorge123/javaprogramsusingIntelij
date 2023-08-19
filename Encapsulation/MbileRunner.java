package Encapsulation;

public class MbileRunner {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.setBrand("Samsung");
        m.setCapacity(15);
        m.setScreenSize(300.0);
        System.out.println(m.getBrand());
        System.out.println(m.getCapacity());
        System.out.println(m.getScreenSize());

    }
}
