package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
//        List<Integer> l= List.of(12,34,33,23);
//        l.add(2222);
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add("abc");
        System.out.println(l);


        List<Integer> l1=new ArrayList<Integer>();
        l1.add(45);
        l1.add(22);
        l1.add(123);
        System.out.println(l1);
        List<Integer> l2=new ArrayList();
        l2.add(45);
        l2.add(22);
        l2.add(123);
        System.out.println(l2);
        List<Integer> l3=new ArrayList<>();
        l3.add(45);
        l3.add(22);
        l3.add(123);
        System.out.println(l3);

        System.out.println(l3.get(1));
      l3.set(0,234);
        System.out.println(l3);
        l.addAll(l3);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        System.out.println(l.size());
        for(Integer al:l1)
        {
            System.out.println(al);
        }
        System.out.println("*********");
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println("*********");
        Iterator i=l1.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
