package forloop;

public class ContinueExampleUsingWhile {
    public static void main(String[] args) {
        int i=0;
        int limit=10;
        while(i<=limit)
        {
            i++;
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);

        }
    }
}
