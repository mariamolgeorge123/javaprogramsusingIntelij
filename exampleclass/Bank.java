package exampleclass;

public class Bank {
    public static void main(String[] args) {
        BankRunner bank=new BankRunner();
        bank.branch="koothattukulam";
        bank.managername="rani";
        bank.year=1990;
        bank.loan();
        bank.saving();
    }

}
class BankRunner
{

    String branch;
    int year;
    String managername;
    public void loan()
    {
        System.out.println(branch+"branch  giving loan");
    }

    public void saving()
    {
        System.out.println(branch+"branch starts to provide zero balance account");
    }
}
