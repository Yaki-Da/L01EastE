package Lvl_II.h09_IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex08ChannelBuffer1 {
    public static void main(String[] args) {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";

        try (RandomAccessFile file = new RandomAccessFile(pA+pD+"test06.txt", "rw");
             FileChannel channel = file.getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(25);    //Создается ByteBuffer с размером 25 байт
            StringBuilder stix = new StringBuilder();       //Создается для накопления прочитанных символов в строку

            //считывает данные из канала в буфер и возвращает количество прочитанных байтов.
            //Чтение данных из файла
            int byteRead = channel.read(buffer);
            //Цикл продолжается, пока byteRead больше 0, что означает, что есть данные для чтения.
            //Основной цикл чтения
            while (byteRead>0) {
                System.out.println("Read(Limits): "+byteRead);
                buffer.flip();  //переключает режим буфера с записи на чтение. Это позволяет читать данные, которые
                                //были записаны в буфер.

                //Чтение данных из буфера
                while (buffer.hasRemaining()) { //считывает данные из буфера, пока есть оставшиеся байты
                    //извлекает байт из буфера и перемещает позицию на один байт вперед.
                    stix.append((char)buffer.get());
                }
                //Очистка буфера (позиция переводится на 0)
                buffer.clear();
                byteRead = channel.read(buffer); //Заполняет буффер с канала
            }
            System.out.println(stix);

            //Запись в файл
            String text = "\n\nDie Tranen greiser Kinderschar" +
                    "\nIch zieh sie auf ein weises Haar" +
                    "\nWerf in die Luft die nasse Kette";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes()); //автоматически распределяет размер буффера

//            создаем буффер с размерами под текст вносимый в файл
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            заполняем буффер, текстом
//            buffer2.put(text.getBytes());
//            обнуляем конкентку буффера по лимиту ему
//            buffer2.flip();
//            заполняем канал, из буфера где тот в свою очередь занесет в файл.

            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
