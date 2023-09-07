package ExceptionPackage;

public class TryExce {
    public static void main(String[] args) {
        String s="data";
        s=null;
        try {
            System.out.println(s.trim());
        }
        catch(NullPointerException |ArithmeticException e1)
        {
            e1.printStackTrace();
        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
        finally {
            System.out.println("finally");
        }

        System.out.println("haiii");
    }
}
