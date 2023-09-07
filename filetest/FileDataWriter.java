package filetest;

import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter {
    public static void main(String[] args) throws IOException {
//        try {
//            FileWriter f = new FileWriter("Pragra234.txt");
//            f.write("hai");
//            f.close();
//        }
//        catch(IOException e)
//        {
//            System.out.println(e);
//        }


        try(FileWriter f = new FileWriter("Pragra34.txt")) {

            f.write("hello");

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
