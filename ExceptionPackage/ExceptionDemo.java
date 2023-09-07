package ExceptionPackage;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="maria";
        name=null;
        try {
            System.out.println(name.trim());
//            try  //this is also possiblie
//            {
//
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("I am in finally block");
        }

        System.out.println("helloworld");
    }
}
