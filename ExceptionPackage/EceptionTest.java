package ExceptionPackage;

import java.util.Scanner;

public class EceptionTest {
    public static void main(String[] args) {

        String name="maria";
        name=null;
        try(Scanner sc=new Scanner(System.in)) { //try with resources
            System.out.println(name.trim());
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        System.out.println("helloworld");
    }
}
