package Inheritance;
class StudentClass
{
    String studentName;
    String teacherName;
    int strength;
    public void display()
    {
        System.out.println("it is parent class");
        System.out.println("StudentName : "+studentName+"TeacheName"+teacherName+"Strength"+strength);
    }
}
class Student extends StudentClass
{

    public void display()
    {
        System.out.println("it is child class");
        System.out.println("StudentName : "+super.studentName+"TeacheName"+teacherName+"Strength"+strength);
    }
    public void display2()
    {
        System.out.println("it is child class");
        System.out.println("StudentName : "+studentName+"TeacheName"+teacherName+"Strength"+strength);
    }
}
public class ClassData {
    public static void main(String[] args) {
        Student s=new Student();
        s.studentName="ammu";
        s.teacherName="anu";
        s.strength=200;
        s.display();
        s.display();
        s.display2();

//        StudentClass s=new StudentClass();
//        s.studentName="ammu";
//        s.teacherName="anu";
//        s.strength=200;
//        s.display();


//        StudentClass s=new Student();
//        s.studentName="ammu";
//        s.teacherName="anu";
//        s.strength=200;
//        s.display();


    }
}
