package AccessSpecifierPackage;

class Student
{
    private int id;
    private String name;

    private int age;

    private String password="abc123";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class AccessSpecifierpackage {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Maria");
        s.setAge(32);
        s.setId(101);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getPassword());

    }
}
