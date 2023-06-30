package basics;

public class ArithemeticDemo {
    public static void main(String[] args) {
        int x=10;
        x++; //increment after assigning
        System.out.println("x:"+ x);
        int y=10;
        ++y;
        System.out.println("y:"+ y);


        int x1=10;
        x1--;
        System.out.println(x1--); //9
        System.out.println(x1); //8
        System.out.println(x1++); //8
        System.out.println(x1); //9


    }
}
