package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestExample {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(10);
        l1.add(10);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        System.out.println(Collections.min(l1));
        System.out.println(Collections.max(l1));
        System.out.println(Collections.frequency(l1,10));
    }
}
