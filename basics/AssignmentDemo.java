package basics;

public class AssignmentDemo
{
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("before"+x+" "+y);
        int temp=x;
         x=y;
         y=temp;

         System.out.println("after"+x+" "+y);


    }
}
