package FunctionalInterface;

public class CalculateRunner {
    public static void main(String[] args) {
        Calculate c=(int a,int b)->{
            System.out.println(a*b);
        };
        c.calc(6,2);
        Calculate c1=(int a,int b)->{
            System.out.println(a/b);
        };
        c1.calc(6,2);
        Calculate c2=(int a,int b)->{
            System.out.println(a-b);
        };
        c2.calc(6,2);
        Calculate c3=(int a,int b)->{
            System.out.println(a+b);
        };
        c3.calc(6,2);
    }
}
