package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();
        q.add("one");
        q.add("two");
        q.add("three");
        System.out.println(q);
        Queue<String> q1=new PriorityQueue<>();
        q1.offer("four");
        q1.offer("five");
        q1.offer("six");
        q1.offer("abc");
        q1.offer("aae");
        System.out.println(q1);
        q.addAll(q1);
        System.out.println(q);
        System.out.println(q.getClass().getSimpleName());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);


        Deque<String> dq=new ArrayDeque<>();
        dq.offer("ten");
        dq.offer("twenty");
        dq.offer("thirty");
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.peek());
        System.out.println(dq);

        System.out.println(dq.contains("ten"));
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());

    }
}
