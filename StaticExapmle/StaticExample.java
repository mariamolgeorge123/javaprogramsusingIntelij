package StaticExapmle;

public class StaticExample {
    int id;
    String Name;
    static String course="Java";

    public StaticExample(int id, String name) {
        this.id = id;
        Name = name;
    }
    public void printdata()
    {
        System.out.println(id+" "+Name+" "+course);
    }

    public static void main(String[] args) {
        StaticExample ae=new StaticExample(101,"abey");
        ae.printdata();
        StaticExample ae1=new StaticExample(102,"maria");
        ae1.printdata();


    }
}
