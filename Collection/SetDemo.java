package Collection;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>(); //no order
        s.add(12);
        s.add(20);
        s.add(15);
        System.out.println(s);
        s.clear();
        System.out.println(s);
        Set<Integer> ss=new LinkedHashSet<>(); //insertion order
        ss.add(12);
        ss.add(20);
        ss.add(15);
        System.out.println(ss);
        Set<Integer> sss=new TreeSet<>(); //insertion order
        sss.add(12);
        sss.add(20);
        sss.add(15);
        sss.add(15);
        System.out.println(sss);

    }
}
