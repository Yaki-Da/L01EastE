package Lvl_II.h09_IO_NIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01FileWriterReader {
    public static void main(String[] args) throws IOException {
        String filePath01 = "C:\\Users\\union\\IdeaProjects\\L01EastE" +
                "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\test01.txt";
        String stext = "Много лет размышлял я над жизнью земной.\n" +
                    "Непонятного нет для меня под луной.\n" +
                    "Мне известно, что мне ничего не известно!\n" +
                    "Вот последняя правда, открытая мной.\n";
        String s = "Привет";
        FileWriter fileW = null;
        FileReader fileR = null;
        try {
            fileW = new FileWriter(filePath01);
//            fileW = new FileWriter("test02.txt");
//            for(int i=0; i<stext.length(); i++) {
//                fileW.write(stext.charAt(i));
//            }
            fileW.write(stext);
            fileW.write(s);
            System.out.println("Текст записан успешно!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileW.close();
        }
        System.out.println("-------------------------");
        try {
            fileR = new FileReader(filePath01);
            int memory;
            while((memory = fileR.read()) != -1) {
                System.out.print((char)memory);
            }
            System.out.println("\n-------------------------\nТекст прочтён успешно!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileR.close();
        }
    }
}
