package Inheritance;
class Employee
{
    String name;
    String Address;
    int salary;
    public Employee(String name,String Address)
    {
        this.name=name;
        this.Address=Address;

    }
    public void data1()
    {
        System.out.println("data1");
    }
}
class FullTime extends Employee
{
    int salary;
    public FullTime(String name,String Address,int Salary)
    {
        super(name,Address);
        this.salary=Salary;
       // super.data1();

    }
    public void EmployeeData()
    {

        System.out.println("Name :"+name+"  Address :"+Address+" Salary"+salary+" Type  : FullTime");
    }

}
class PartTimeEmployee extends Employee
{
    int hour;
    int hourlysalary;

    public PartTimeEmployee(String name, String Address, int hour, int hourlysalary) {

        super(name, Address);
//        super.name="ass";
        this.hour = hour;
        this.hourlysalary = hourlysalary;

    }
    public void EmployeeData()
    {

        System.out.println("Name :"+name+"  Address :"+Address+" Salary"+(hour*hourlysalary)+"  Type : PartTime");

    }
    public void data2()
    {
        super.data1();
        System.out.println("data2");
        super.data1();
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        PartTimeEmployee e=new PartTimeEmployee("Annu","anjunivas",5,200);
        e.EmployeeData();
        e.data2();

        FullTime e2=new FullTime("Ammu","Annu villa",12000);
        e2.EmployeeData();


    }
}
