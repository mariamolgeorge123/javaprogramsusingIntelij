package AbstractionExample;

public class PartTime extends Employee {
    PartTime(String name,int age)
    {
        super(name,age);
    }
    @Override
    public void perform() {
        System.out.println("perform well");
    }


}
