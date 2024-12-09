package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex12PathFiles3 {
    public static void main(String[] args) throws IOException {
        String pAD = System.getProperty("user.dir")+"\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";

        Path fP = Paths.get("test10.txt");

        if(Files.exists(Paths.get(pAD+"test10.txt"))) {
            Files.delete(Paths.get(pAD+"test10.txt"));
            System.out.println("Удалено : "+pAD+"test10.txt");
        }
        else {
            Files.createFile(Paths.get(pAD+"test10.txt"));
            System.out.println("Создан : "+pAD+"test10.txt");
        }
        String talk = "-Hi\n-Hi mr.Fridman\n-Whats you want?\n-I need money!\n-I not want give you money!";

        Files.write(Paths.get(pAD+"test10.txt"),talk.getBytes());
        System.out.println("Создан : "+pAD+"test10.txt (добавлен текстовый диалог в файл)");

        List<String> list = Files.readAllLines(Paths.get(pAD+"test10.txt"));
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("Чтение из файла : "+pAD+"test10.txt Успешно!!!");
    }
}
