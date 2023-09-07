package filetest;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileData1 {
    public static void main(String[] args) {
        File f=new File("data1.txt");
        try {
            boolean b = f.createNewFile();
            System.out.println(b);
            boolean b1 = f.canRead();
            System.out.println(b1);
            boolean b2 = f.canWrite();
            System.out.println(b2);
            boolean b4 = f.exists();
            System.out.println(b4);
            System.out.println(f.length());
            System.out.println(f.getName());
            String s1=f.getAbsolutePath();
            System.out.println(s1);
            String[] str=f.list();
            System.out.println(str);
            Boolean blr=f.mkdir();
            System.out.println(blr);

            FileWriter fw=new FileWriter(f);
            fw.write("This is new file");
            fw.write("   This is new data");
            fw.write("   This is very important");
            fw.close();
            Scanner sc=new Scanner(f);
            while (sc.hasNext())
            {
                String s=sc.nextLine();
                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
