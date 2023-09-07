package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();
                names.add("Anu");
        names.add("Appu");
        names.add("Anju");
        names.add("Ansu");
        names.add("Arathi");

        System.out.println(names.peek());
        System.out.println("***********");
        System.out.println(names.pop());
        System.out.println("**************");
        System.out.println(names);
        System.out.println("**************");
        System.out.println(names.remove("Anu"));
        System.out.println(names);
        System.out.println(names.get(0));


    }
}
