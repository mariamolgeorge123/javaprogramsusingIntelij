package CollectionPracticeExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("white");
        System.out.println(colors);
        Iterator itr=colors.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        colors.add(0,"black");
        System.out.println(colors);
        int size=colors.size();
        colors.add(size,"rose");
        System.out.println(colors);
        for (String col:colors)
        {
            System.out.println(col);
            if(col.equals("blue"))
            {
                System.out.println("color found");
            }
        }
        System.out.println("*******");
        for (int i=0;i<colors.size();i++)
        {
            System.out.println(colors.get(i));
        }
        colors.set(1,"yellow");
        System.out.println(colors);
        colors.remove(3);
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println(Collections.max(colors));
        System.out.println(Collections.min(colors));
        System.out.println(colors.getClass().getSimpleName());
        List<String> l=new ArrayList<>();
        l.addAll(colors);
        System.out.println(l);
        List<String> l1=new ArrayList<>();
        l1.add("1");
        l1.add("1");
        l1.add("1");l1.add("1");
        l1.add("1");


        Collections.copy(l1,colors);
        System.out.println("******");
        System.out.println(l1);
    }
}
