package AbstractionExample;

public abstract class Salary extends Employee {
    public Salary(String name, int age) {
        super(name, age);
    }

    abstract void  salarydata();
}
