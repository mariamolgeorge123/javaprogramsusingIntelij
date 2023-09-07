package CollectionPracticeExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<String> colors=new LinkedList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("white");
        System.out.println(colors);
        System.out.println(colors.get(0));

        System.out.println(colors.get(colors.size()-1));


//        System.out.println("remove all elements");
//        colors.clear();
//        System.out.println(colors);


//        swap oth 2nd positin
        System.out.println(colors);
        Collections.swap(colors,0,2);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
        List<String> car=new LinkedList<>();
        car.add("ferari");
        car.add("indica");
        car.add("bmw");
        List<String> data=new LinkedList<>();
        //join two linked list to a new linked list
        data.addAll(car);
        data.addAll(colors);
        System.out.println(data);
        List<String> data1=new LinkedList<>();
        //copy from one linked list to another
        data1.addAll(data);
        System.out.println(data1);

//        cnvert linked list to array list
        List<String> conv=new ArrayList<>(data1);
        System.out.println(conv.getClass().getSimpleName());

        System.out.println("*****************");
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //comparison output in linked list
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
           c3.add(c2.contains(e)?"yes":"no");
        System.out.println(c3);


    }
}
