package StaticExapmle;

public class StaticTest {
    static int count=0;
    StaticTest(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        StaticTest s=new StaticTest();
        StaticTest s1=new StaticTest();
        StaticTest s2=new StaticTest();
        StaticTest s3=new StaticTest();

    }
}
