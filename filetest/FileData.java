package filetest;

import java.io.File;
import java.io.IOException;

public class FileData {
    public static void main(String[] args) {
        File f=new File("pragra123.txt");
        try {
            boolean newfile = f.createNewFile();
            System.out.println(f.isFile());
            System.out.println(f.getName());
            System.out.println(f.delete());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
