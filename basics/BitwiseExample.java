package basics;

public class BitwiseExample {
    public static void main(String[] args) {
        int a =5;//101
        int b=2;//010

        System.out.println("bitwise and"+(a&b)); //000 0
        System.out.println("bitwise or"+(a|b)); //111 7
        System.out.println("bitwise xor"+(a^b)); //111 7
        System.out.println("bitwise complement"+(~a)); //1010
        
    }
}
