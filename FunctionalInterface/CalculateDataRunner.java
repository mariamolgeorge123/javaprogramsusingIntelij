package FunctionalInterface;

public class CalculateDataRunner {
    public static void main(String[] args) {


        CalculateData ad = (a, b) -> a + b;
        CalculateData mul = (a, b) -> a * b;
        CalculateData div = (a, b) -> a / b;
        CalculateData sub = (a, b) -> a - b;

        System.out.println(ad.data(8, 2));
        System.out.println(mul.data(8, 2));
        System.out.println(div.data(8, 2));
        System.out.println(sub.data(8, 2));








    }

}
