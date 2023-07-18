package AssignmentUsingMethods;

public class PrintPragra {
    public void printData()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==1)
            {
                continue;
            }
            System.out.println(i+"pragra");

        }
    }
    public static void main(String[] args) {
        PrintPragra pragra=new PrintPragra();
        pragra.printData();
    }
}
