package FunctionalInterface;

public class BankRunner {
    public static void main(String[] args) {
        Bank b=new Bank() {
            @Override
            public void loan() {
                System.out.println("provide loan");
            }
        };
        b.loan();
        b.deposit();
        b.loan();

        Bank b1=()->{System.out.println("provide loan");};
        b1.loan();
        b1.deposit();
        b1.loan();
    }
}
