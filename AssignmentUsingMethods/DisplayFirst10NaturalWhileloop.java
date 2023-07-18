package AssignmentUsingMethods;

public class DisplayFirst10NaturalWhileloop {
    public void printdata()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        DisplayFirst10NaturalWhileloop datas=new DisplayFirst10NaturalWhileloop();
        datas.printdata();

    }
}
