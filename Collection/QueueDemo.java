package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new PriorityQueue<>();
        System.out.println(q.getClass().getSimpleName());
        q.offer(12);
        q.offer(34);
        q.offer(342);
        q.offer(456);
        q.offer(12);
        System.out.println(q);
        System.out.println("**************");
        System.out.println(q.poll());
        System.out.println("**************");
        System.out.println(q);
        System.out.println("**************");
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }
}
