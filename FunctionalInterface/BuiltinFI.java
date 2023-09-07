package FunctionalInterface;

import java.util.function.*;

public class BuiltinFI {
    public static void main(String[] args) {
        System.out.println("**********CONSUMER*****************");
        //returns nothing accept 1 parameter
        Consumer<String> c=(input)->{
            System.out.println(input.toUpperCase());
        };
        c.accept("this is consumer");

        Consumer<String> cs=(data)->{
            System.out.println(data.trim());
        };
        cs.accept("  pragra  ");
        System.out.println("**********BICONSUMER*****************");
        //returns nothing accept 2 parameter
        BiConsumer<Integer,Integer> bi=(num1,num2)->{
            System.out.println(num1+num2);};
        bi.accept(10,20);
        System.out.println("**********predicate*****************");
        //returns boolean accept 1 input parameter,boolean valued function
        Predicate<Integer> pre=(i)->i%2==0;
        System.out.println(pre.test(6));
        System.out.println("**********Supplier*****************");
        //input nothing ---return value
        Supplier<String> sup=()->"hello how are you";
        String s=sup.get();
        System.out.println(s);

        System.out.println("**********Function*****************");
        Function<String,Integer> function=(st)->st.length();
        System.out.println(function.apply("maria"));

        System.out.println("**********BiFunction*****************");
        BiFunction<Integer,Integer,Integer> bifu=(a,b)->a+b;
        System.out.println(bifu.apply(20,30));

    }
}
