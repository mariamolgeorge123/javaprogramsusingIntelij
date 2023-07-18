package AssignmentUsingMethods;

public class DisplayFirst10NaturalDoWhileloop {
    public void printdata()
    {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
    }
    public static void main(String[] args) {
        DisplayFirst10NaturalDoWhileloop datas=new DisplayFirst10NaturalDoWhileloop();
        datas.printdata();

    }
}
