package basics;

public class IncrementDecerment
{
    public static void main(String[] args) {
        int x=10;
        x++;
        System.out.println(x);//11
        System.out.println(x++);//11
        System.out.println(x);//12

        x--;
        System.out.println(x);//11
        System.out.println(x--);//11
        System.out.println(x);//10

        ++x;
        System.out.println(x);//11
        System.out.println(++x);//12
        System.out.println(x);//12

        --x;
        System.out.println(x);//11
        System.out.println(--x);//10
        System.out.println(x);//10

    }
}
