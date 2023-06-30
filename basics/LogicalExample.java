package basics;

public class LogicalExample {
    public static void main(String[] args) {
        int x=10;
        int y=12;
        int z=42;
        System.out.println(x>y && y<z); //false
        System.out.println(x>y || y<z);  //true
        System.out.println(!(x>y)); //true
    }
}
