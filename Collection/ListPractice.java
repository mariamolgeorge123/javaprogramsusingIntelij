package Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        ArrayList ll=new ArrayList();
        ll.add("hai");
        ll.add("may");
        ll.add("june");
        ll.add(23);
        ll.add(24);
        ll.add(2.01);
        System.out.println(ll);


        List l=new ArrayList();
        l.add("hai");
        l.add("may");
        l.add("june");
        l.add(23);
        l.add(24);
        l.add(2.01);
        System.out.println(l);


        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(7);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l.get(2));
        l1.remove(1);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.indexOf(3));
        System.out.println(l1.contains(1));
        System.out.println(l1.isEmpty());
       // l1.set(3,32);
        l1.add(52);
        System.out.println(l1);
        l1.set(2,345);
        System.out.println(l1);
        l1.add(2,25);
        System.out.println(l1);
        List<Integer> l2=new ArrayList();
        l2.add(70);
        l2.add(130);
        l2.add(73);
        l1.addAll(l2);
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        System.out.println(l1.getClass().getSimpleName());
        System.out.println("***********");
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println("***********");
        for(Integer i:l1)
        {
            System.out.println(i);
        }
        System.out.println("***********");
        Iterator ii=l1.iterator();
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }


        System.out.println("***********");
        List<String> fruit=List.of("apple","orange");
        System.out.println(fruit.getClass().getSimpleName());
       // fruit.add("mango");
        System.out.println(fruit);
        List<String> fruits=new ArrayList<>(fruit);
        fruits.add("mango");
        System.out.println(fruits);
        System.out.println(fruits.getClass().getSimpleName());



        List<String> veg=new LinkedList<>();
        veg.add("mango");
        veg.add("potato");
        veg.add("carrot");
        System.out.println(veg);
        System.out.println(veg.indexOf(0));
        System.out.println(veg.contains("mango"));
        System.out.println(veg.isEmpty());
        System.out.println(veg.get(1));
        veg.remove("mango");
        System.out.println(veg);
        veg.set(1,"banana");
        System.out.println(veg);
        veg.add(1,"brinjal");
        System.out.println(veg);


        List<String> animal=new Vector<>();
        animal.add("elephent");
        animal.add("cow");
        animal.add("pig");
        System.out.println(animal);
        System.out.println(animal.indexOf("cow"));
        System.out.println(animal.isEmpty());
        System.out.println(animal.contains("akak"));
        animal.set(1,"giraff");
        System.out.println(animal);
        animal.add(1,"lion");
        System.out.println(animal);
        System.out.println(animal.get(3));
        System.out.println(animal.size());
        Iterator ij=animal.iterator();
        while (ij.hasNext())
        {
            System.out.println(ij.next());
        }
        System.out.println("***********");
        animal.remove(0);
        System.out.println(animal);


List<String> stak=new Stack<>();
stak.add("pen");
stak.add("chair");
stak.add("bench");
        System.out.println(stak);
        System.out.println(stak.size());
        System.out.println(stak.get(1));
       // System.out.println(stak.peek());

        Vector<String> stak1=new Stack<>();
        stak1.add("pen");
        stak1.add("chair");
        stak1.add("bench");
        System.out.println(stak1);
        System.out.println(stak1.size());
        System.out.println(stak1.get(1));
//        System.out.println(stak1.stream().pop());


        Stack<String> things=new Stack<>();
        things.add("sugar");
        things.add("salt");
        things.add("rice");
        System.out.println(things);
        things.push("wheet");
        System.out.println(things);
        System.out.println(things.peek());
        System.out.println(things.pop());
        System.out.println(things);
        Stack<Integer> num=new Stack<>();
        num.add(1);
        num.add(7);
        num.add(23);
        num.push(34);
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.peek());
        System.out.println(num);
        Iterator iu=num.iterator();
        while (iu.hasNext())
        {
            System.out.println(iu.next());
        }
        System.out.println(num.size());
//        System.out.println(num.remove(34));not possible
        System.out.println(num.get(1));
        num.remove(1);
        System.out.println(num);


        //remove word which contain at


        List<String> data=new ArrayList<>();
        data.add("cat");
        data.add("mat");
        data.add("sjt");
        data.add("sit");
        Iterator itr=data.iterator();
        while (itr.hasNext())
        {
            String str=(String)itr.next();
            if(str.endsWith("at"))
            {
                itr.remove();
            }

        }
        System.out.println(data);

        List<Integer> d=new ArrayList<>();
        d.add(2);
        d.add(17);
        d.add(1);
      d.remove(Integer.valueOf(17));
        System.out.println(d);
        d.add(11);
        d.add(10);
        d.add(8);
        d.add(7);
        System.out.println(d);
        Collections.sort(d);
        System.out.println(d);

List<Integer> l4=new ArrayList<>();
l4.add(23);
l4.add(7);
l4.add(2);
l4.add(1);
        System.out.println(l4.getClass().getSimpleName());

        List<Integer> l5=new LinkedList<>(l4);
        System.out.println(l5.getClass().getSimpleName());


    }







}
