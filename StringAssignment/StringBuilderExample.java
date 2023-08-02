package StringAssignment;

public class StringBuilderExample {
    public static void main(String[] args) {
        String s="pragra";
        System.out.println(s.concat(" Toronto"));
        System.out.println(s);//immutable

        StringBuffer str=new StringBuffer("maria");
        str.append(" in toronto");
        System.out.println(str); //mutable serializable thread safe.multiple thread can't change the value same time
        System.out.println(str.reverse());

        StringBuilder str1=new StringBuilder("Abey");
        str1.append(" in toronto");
        System.out.println(str1); //mutable  not thread safe
        System.out.println(str1.reverse());


    }
}
