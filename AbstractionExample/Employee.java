package AbstractionExample;

public abstract class Employee {
    int salary;
    String name;
    int age;
    public Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public abstract void perform();
    public void data()
    {
        System.out.println("name"+name+"age"+age);
    }
}
