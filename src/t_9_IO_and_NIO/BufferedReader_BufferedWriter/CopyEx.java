package t_9_IO_and_NIO.BufferedReader_BufferedWriter;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        /** В блоке try создали 2 объекта обертки */
        try(BufferedReader reader = new BufferedReader(
                new FileReader("Test3.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("Test3-2.txt"));
        ){
            /** Старый вариант
            int character;
            while ((character = reader.read()) != -1){
                writer.write(character);
            } */

            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n"); // после каждой строки переводит каретку на новую строку
            }

            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
