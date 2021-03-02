package t_9_IO_and_NIO.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader reader= null;
        try {
            reader = new FileReader("Test3.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char)character);
            }
            System.out.println();
            System.out.println("Выполнено!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
