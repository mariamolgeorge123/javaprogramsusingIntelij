package StringPackage;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.name="anu";
        s.age=10;
        System.out.println(s);
        System.out.println(s.name+" "+s.age);

    }
}
