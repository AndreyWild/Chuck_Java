package Tests.Test7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    public static void main(String[] args) {
        // Создали файл для записи и чтения
        try(RandomAccessFile file = new RandomAccessFile("test_t.txt", "rw");
            // Получили канал из файла
            FileChannel channel = file.getChannel();
        ){
            /** ------------------- Запись текста в файл ------------------- */

            String text = "On a dark desert highway, cool wind in my hair\n" +
                    "Warm smell of colitas, rising up through the air\n" +
                    "Up ahead in the distance, I saw a shimmering light\n" +
                    "My head grew heavy and my sight grew dim\n" +
                    "I had to stop for the night\n" +
                    "There she stood in the doorway;\n" +
                    "I heard the mission bell\n" +
                    "And I was thinking to myself,\n" +
                    "\"This could be Heaven or this could be Hell\"\n" +
                    "Then she lit up a candle and she showed me the way\n" +
                    "There were voices down the corridor,\n" +
                    "I thought I heard them say...";

            // Создал буфер = массив байт полученных из text + flip()
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
            // Запись в файл через канал из буфера
            channel.write(buffer);

            /** ------------------- Чтение текста из файла ------------------- */

//            buffer.flip();
            StringBuilder words = new StringBuilder();
//            ByteBuffer buffer2 = ByteBuffer.allocate(25);

            // Создаем переменную = при помощи channel читаем информацию из файла
            // и записываем ее в buffer (возвращает количество прочитанных байт)
            int byteBufer = channel.read(buffer);
            System.out.println(byteBufer);
            while (byteBufer >0){
                System.out.println("Read " + byteBufer);
                while (buffer.hasRemaining()){ // hasRemaining() - пока есть что читать - читаем из буфера
                    words.append((char)buffer.get()); // В StringBuilder добавляем (кастим в чар) байты из buffer по-порядку
                }
                buffer.clear(); // меняет режим буфера с чтения на запись (position = 0),
                // старые байты не удаляются а записываются поверх старых

                byteBufer = channel.read(buffer); // читаем информацию из файла и записываем ее в буфер
            }
            System.out.println(words);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
