package InnerClassExample;

public class OutClass {
    String name="ABC";
    public void printData()
    {
        System.out.println("Name"+name);
    }
    class InClasss
    {
        int age;
        public void printAge()
        {
            System.out.println("Age"+age);
        }
    }
}
