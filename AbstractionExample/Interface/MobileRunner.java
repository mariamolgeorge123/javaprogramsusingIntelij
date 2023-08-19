package AbstractionExample.Interface;

public class MobileRunner {
    public static void main(String[] args) {
//        Mobile m=new Mobile();
//        m.makecall();
//        m.addData();
//        m.makeMessage();

        Telephone t=new Telephone() {
            @Override
            public void makecall() {

            }

            @Override
            public void makeMessage() {

            }

            @Override
            public void addData() {
                System.out.println("addiiiiing data");
            }

            @Override
            public void calculateData() {

            }
        };
        t.addData();


    }
}
