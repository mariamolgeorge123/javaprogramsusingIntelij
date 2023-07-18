package exampleclass;

public class Animal {

    public static void main(String[] args) {
        AnimalRunner animal=new AnimalRunner();
        animal.age=20;
        animal.color="red";
        animal.name="lion";
        animal.eating();
        animal.running();
        animal.sleeping();
    }

}
 class AnimalRunner
{
    String color;
    int age;
    String name;
    public void eating()
    {
        System.out.println(name+"  eating");
    }

    public void running()
    {
        System.out.println(name+"  running");
    }
    public void sleeping()
    {
        System.out.println(name+"  sleeping");
    }
}
