package day02.exceptionEx.resourceEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

    public static void main(String[] args)  {
        FileWriter file1 = null;
        FileWriter file2 = null;

        //감싸기 mac: option+command +T Try Catch 단축키

        try {
            file1 = new FileWriter("data.txt");
            file1.write("Java Advanced Programming");

            file2 = new FileWriter("data1.txt");
            file2.write("Java Advanced Programming2");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
