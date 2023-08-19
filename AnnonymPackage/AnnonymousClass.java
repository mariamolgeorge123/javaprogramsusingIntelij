package AnnonymPackage;

public class AnnonymousClass {
    public static void main(String[] args) {
        Furniture f=new Furniture() {
            @Override
            public void sit() {
                System.out.println(" sit on chair");
            }

            @Override
            public void stand() {
                System.out.println("Stand on table");

            }
        };
        f.sit();
        f.stand();
    }
}
