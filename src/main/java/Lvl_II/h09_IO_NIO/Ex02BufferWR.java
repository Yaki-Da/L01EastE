package Lvl_II.h09_IO_NIO;

import java.io.*;

public class Ex02BufferWR {
    public static void main(String[] args) {
        String pathA = System.getProperty("user.dir");
        String pathD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        String filenameR = "test01.txt";
        String filenameW = "test03.txt";
        String imgnameR = "img01.jpg";
        String imgnameW = "img01_bad_copy.jpg";
        try(BufferedReader bFR = new BufferedReader(new FileReader(pathA+pathD+filenameR));
            BufferedWriter bFW = new BufferedWriter(new FileWriter(pathA+pathD+filenameW));
            BufferedReader bIR = new BufferedReader(new FileReader(pathA+pathD+imgnameR));
            BufferedWriter bIW = new BufferedWriter(new FileWriter(pathA+pathD+imgnameW))) {
            String memory;
            while((memory=bFR.readLine()) != null) {
                bFW.write(memory+'\n');
            }
            while((memory=bIR.readLine()) != null) {
                bIW.write(memory+'\n');
            }
            System.out.println("---===Запись произошла успешно!!!===---");
            System.out.println(pathA+pathD+filenameR+"\n"+pathA+pathD+filenameW);
            System.out.println(pathA+pathD+imgnameR+"\n"+pathA+pathD+imgnameW);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
