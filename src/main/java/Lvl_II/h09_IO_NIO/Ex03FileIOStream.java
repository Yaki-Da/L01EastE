package Lvl_II.h09_IO_NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03FileIOStream {
    public static void main(String[] args) {
        String pathA = System.getProperty("user.dir");
        String pathD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        try (FileInputStream fIS = new FileInputStream(pathA+pathD+"img01.jpg");
             FileOutputStream fOS = new FileOutputStream(pathA+pathD+"img01_good_copy.jpg")){
            int i;
            while ((i=fIS.read())!=-1) {
                fOS.write(i);
            }
            System.out.println("Копирование файлов произошло успешна!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
