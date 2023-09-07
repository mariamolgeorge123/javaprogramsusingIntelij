package FunctionalInterface;
@FunctionalInterface
public interface Bank {
    void loan();
   default void deposit()
   {
       System.out.println("deposit money");
   }
    static void withdraw()
    {
        System.out.println("withdraw money");
    }

}
