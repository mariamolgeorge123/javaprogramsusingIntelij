package StringPackage;

public class ConcatExample {
    public static void main(String[] args) {
        String s1="pragra";
        int num1=20;
        System.out.println(s1+s1); //pragrapragra
        System.out.println(s1+s1+num1); //pragrapragra20
        System.out.println(s1+s1+num1+num1);//pragrapragra2020
        System.out.println(num1+num1+s1); //40pragra
        System.out.println(s1+num1+s1+num1);//pragra20pragra20
    }
}
