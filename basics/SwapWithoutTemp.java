package basics;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int x=15;
        int y=25;

        System.out.println("before x: " + x);
        System.out.println("before y: " +y);
        System.out.println("********************");
      ;
        System.out.println("after x: " + ((x+y)-x));
        System.out.println("after y: " +((x+y)-y));
    }
}
