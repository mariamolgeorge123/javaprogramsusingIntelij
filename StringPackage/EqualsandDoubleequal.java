package StringPackage;

public class EqualsandDoubleequal {
    public static void main(String[] args) {
        String s1="pragra";
        String s2="pragra";
        String s3=new String("pragra");
        String s4=new String("pragra");
        System.out.println(s1==s2); //true  //check conent and memory location
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s1.equals(s2)); //true //check content
        System.out.println(s1.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true


    }
}
