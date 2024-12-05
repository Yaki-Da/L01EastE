package Lvl_II.h09_IO_NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03FileIOStream {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\L01EastE\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        try (FileInputStream fIS = new FileInputStream(pathD+"img01.jpg");
             FileOutputStream fOS = new FileOutputStream(pathD+"img01_good_copy.jpg")){
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
