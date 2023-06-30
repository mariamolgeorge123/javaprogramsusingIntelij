package basics;

public class SwapWithoutTempSingleLine {
    public static void main(String[] args) {
        int x=15;
        int y=25;
        System.out.println("before x and y   :"+x+" "+y);
        System.out.println("********************");
        System.out.println("after x and y   :"+((x+y)-x)+" "+((x+y)-y));
    }
}
