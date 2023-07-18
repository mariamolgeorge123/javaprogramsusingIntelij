package exampleclass;



public class BankAccount {
    public static void main(String[] args) {
        BankAccountRunner bank=new BankAccountRunner();
        bank.name="maria";
        bank.accountnumber="12098766";
        bank.ifsccode="hg23h33333";
        bank.applyloan();
        bank.applysaving();
    }

}
class BankAccountRunner {

    String name;
    String ifsccode;
    String accountnumber;

    public void applyloan() {
        System.out.println(name + " applying for loan");
    }

    public void applysaving() {
        System.out.println(name + " save cash into account");
    }
}