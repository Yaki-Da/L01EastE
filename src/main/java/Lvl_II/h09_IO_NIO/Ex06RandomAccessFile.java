package Lvl_II.h09_IO_NIO;

import java.io.IOException;

public class Ex06RandomAccessFile {
    public static void main(String[] args) {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        try (java.io.RandomAccessFile raf
                     = new java.io.RandomAccessFile(pA+pD+"test04.txt", "rw")) {
            int a = raf.read();
            System.out.println((char)a);

            String s1 = raf.readLine();
            System.out.println(s1);

            raf.seek(52);
            s1 = raf.readLine();
            System.out.println(s1);

            long pos = raf.getFilePointer();
            System.out.println("Указатель на позиции: "+pos);

//            raf.seek(0);
//            raf.writeBytes("Hello!!! ");

            raf.seek(raf.length());
            raf.writeBytes("\n\t\t\t\tWilliam Butler Yeats");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
