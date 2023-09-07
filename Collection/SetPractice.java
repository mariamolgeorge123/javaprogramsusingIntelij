package Collection;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> name=new HashSet<>();
        name.add("Maria");
        name.add("Anu");
        name.add("Anju");
        name.add("amalu");
        System.out.println(name);
        name.clear();
        System.out.println(name);
        Set<String> name1=new HashSet<>();
        name1.add("Maria");
        name1.add("Anu");
        name1.add("Anju");
        name1.add("amalu");
        System.out.println(name1.contains("Maria"));
        System.out.println(name1.isEmpty());
        Set<String> name2=new HashSet<>();
        name2.add("Maria");
        name2.add("Anu");
        name2.add("Anju");
        name2.add("amalu");
        System.out.println(name2.isEmpty());
        System.out.println("*************");
        System.out.println(name2.remove("Anju"));
        System.out.println(name2.size());
        System.out.println("*************");

        Iterator i=name2.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("****************");

        Set<String> flower=new LinkedHashSet<>();
        flower.add("rose");
        flower.add("sunflower");
        flower.add("dalia");
        System.out.println(flower);


        Set<String> car=new TreeSet<>();
        car.add("santro");
        car.add("bmw");
        car.add("bense");
        car.add("ford");
        System.out.println(car);



        Integer[] ar= {5,4,3,2,1};
        Set<Integer> num=new HashSet<>();
        num.addAll(Arrays.asList(ar));
        System.out.println(num.getClass().getSimpleName());
        List<Integer> l=new ArrayList<>(num);
        System.out.println(l.getClass().getSimpleName());
        System.out.println(num);

        //union -addAll
//        1.union 2 hashset


        Set<Integer> num11=new HashSet<>();
        num11.add(343);
        num11.add(121);
        num11.add(323);
        num11.add(131);
        num11.addAll(l);
        Set<Integer> num111=new HashSet<>();
        num111.add(3);
        num111.add(1);
        num111.add(3);
        num111.add(1);
        num111.addAll(num11);

        //2.union list and hashset
        Set<Integer> num1=new HashSet<>();
        num1.add(34);
        num1.add(12);
        num1.add(32);
        num1.add(13);
        num1.addAll(l);
        System.out.println("l"+l);
        System.out.println("num 1"+num1);
        System.out.println(num1);
//union
        Set<Integer> a=new HashSet<>();
        a.add(6);
        a.add(7);
        Set<Integer> a1=new HashSet<>();
        a1.add(1);
        a1.add(2);
        //union
        a.addAll(a1);
        System.out.println(a);


//difference
        Set<Integer> c1=new HashSet<>();
        c1.add(32);
        c1.add(33);
        Set<Integer> c2=new HashSet<>();
        c2.add(37);
        c2.add(32);
        c1.removeAll(c2);
        System.out.println(c1);


//intersection
        Set<Integer> b1=new HashSet<>();
        b1.add(11);
        b1.add(12);
        Set<Integer> b2=new HashSet<>();
        b2.add(17);
        b2.add(11);
       b1.retainAll(b2);
        System.out.println(b1);
    }
}
