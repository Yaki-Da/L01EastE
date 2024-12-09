package Lvl_II.h09_IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex09ChannelBuffer2 {
    public static void main(String[] args) {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        try (RandomAccessFile file = new RandomAccessFile(pA+pD+"test07.txt", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind(); //обнуляет position
            System.out.println((char)buffer.get());

            System.out.println("----------------------");
            buffer.compact(); //обнуляет позицию при этом сдигая к началу все остальные байты. в зависимости от позиции
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char)buffer.get());
            }
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            buffer.mark(); //отметка позиции буфере в отметке
            buffer.reset(); //позиция принимает по метке, присваивая ее значении

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
