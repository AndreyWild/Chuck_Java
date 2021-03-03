package Tests.Test6.Prog1;

import java.io.*;

public class Prog1 {
    public static void main(String[] args) {
        try(FileInputStream inputStreamPhoto =
                    new FileInputStream("E:\\JavaProjekts\\Chuck_Java" +
                            "\\src\\t_9_IO_and_NIO\\FileInputStream_FileOutputStream\\java.jpg");
            ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("photo.bin"))){
            outputStream.writeObject(inputStreamPhoto);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
