package filetest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadData {
    public static void main(String[] args) {
        try {
            File f=new File("pragra234");
            Scanner sc=new Scanner(f);
            while (sc.hasNext())
            {
                String s=sc.nextLine();
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
