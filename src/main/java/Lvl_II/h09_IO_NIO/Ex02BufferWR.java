package Lvl_II.h09_IO_NIO;

import java.io.*;

public class Ex02BufferWR {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\L01EastE\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        String filenameR = "test01.txt";
        String filenameW = "test03.txt";
        String imgnameR = "img01.jpg";
        String imgnameW = "img01_bad_copy.jpg";
        try(BufferedReader bFR = new BufferedReader(new FileReader(pathD+filenameR));
            BufferedWriter bFW = new BufferedWriter(new FileWriter(pathD+filenameW));
            BufferedReader bIR = new BufferedReader(new FileReader(pathD+imgnameR));
            BufferedWriter bIW = new BufferedWriter(new FileWriter(pathD+imgnameW))) {
            String memory;
            while((memory=bFR.readLine()) != null) {
                bFW.write(memory+'\n');
            }
            while((memory=bIR.readLine()) != null) {
                bIW.write(memory+'\n');
            }
            System.out.println("---===Запись произошла успешно!!!===---");
            System.out.println(pathD+filenameR+"\n"+pathD+filenameW);
            System.out.println(pathD+imgnameR+"\n"+pathD+imgnameR);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
