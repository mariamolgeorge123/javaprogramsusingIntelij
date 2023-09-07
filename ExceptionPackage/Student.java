package ExceptionPackage;

public class Student {
    public static void main(String[] args) {
        Student s=new Student();
        s.callname();
        try {
            s.callThreadSleep();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public void setName()
    {
        try {
            String name = "pragra";
            name = null;
            name.trim();
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
    }
    public void callSetname()
    {
        setName();
    }
    public void callname()
    {
        callSetname();
    }
    public void callThreadSleep() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void callThread() throws InterruptedException
    {
        callThreadSleep();
    }
}
