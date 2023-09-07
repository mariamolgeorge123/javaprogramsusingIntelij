package enumsdata;

import java.util.Scanner;

public class PaymentRunner {
    public static void main(String[] args) {
        System.out.println("I can Use  ::"+PaymentType.MASTER);

        PaymentType p=PaymentType.MASTER;
        switch (p)
        {
            case DEBIT:
                System.out.println("it's debit");
                break;
            case CREDIT:
                System.out.println("it's credit");
                break;
            case MASTER:
                System.out.println("it's Master");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
