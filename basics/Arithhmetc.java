package basics;

public class Arithhmetc {
    public static void main(String[] args) {
        int x=10;
        int y=20;


        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y%x);
        System.out.println(x++);
        System.out.println(++y);
        System.out.println(x--);
        System.out.println(--y);

        int z=30;
        int k=10;
        int c=z++;
        System.out.println("c:"+c);//30
        System.out.println("z++:"+z++);//31
        System.out.println("z:"+z);//32
        System.out.println("z++:"+z++);//32


        int a1=20;
        int a2=++a1;
        System.out.println(a2);//21
        System.out.println(++a1);//22
        System.out.println(a1);//22
        System.out.println(++a1);//23

//int b1=10;
//
//System.out.println(b1--);//10
//int b2=b1--;
//        System.out.println(b2);//9
//        System.out.println(b1);//8
//        System.out.println(b2--);//9
//        System.out.println(b2);//8
//        System.out.println(b1);//8
int b1=10;
int b2=b1--;
        System.out.println("b2:"+b2);//10
        System.out.println("b1--:"+b1--);//9
        System.out.println("b1:"+b1);//8
        System.out.println("b1--:"+b1--);//8


int c1=10;
        int c2=++c1;
        System.out.println(c2);//11
        System.out.println(++c1);//12
        System.out.println(c1);//12
        System.out.println(++c1);//13




    }
}
