package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex11PathFiles2 {
    public static void main(String[] args) throws IOException {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";

        Path fP = Paths.get(pA+pD+"test01.txt");
        Path dP = Paths.get(pA+pD);
        Path sP = Paths.get(pA+pD+"testFolder000\\");
        Path sP2 = Paths.get(pA+pD+"testFolder002\\");

        if(Files.exists(sP)) {
            Files.delete(sP);
            System.out.println("Удалено : "+sP);
        }
        if(Files.exists(sP2.resolve("test01.txt"))) {
            Files.delete(sP2.resolve("test01.txt"));
            System.out.println("Удалено : "+sP2.resolve("test01.txt"));
        }
        if(Files.exists(sP2.resolve("test01renamed.txt"))) {
            Files.delete(sP2.resolve("test01renamed.txt"));
            System.out.println("Удалено : "+sP2.resolve("test01renamed.txt"));
        }
        if(Files.exists(sP2)) {
            Files.delete(sP2);
            System.out.println("Удалено : "+sP2);
        }
        if(Files.exists(sP2.resolve("test01renamed.txt"))) {
            Files.delete(sP2.resolve("test01renamed.txt"));
            System.out.println("Удалено : "+sP2.resolve("test01renamed.txt"));
        }

        Files.createDirectories(sP);
        System.out.println("Создана директория : "+sP);

        Files.copy(dP.resolve(fP.getFileName()),sP.resolve("test01.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Cкопировано из : "+dP.resolve(fP.getFileName())+
                "\nВставлено в : "+sP.resolve("test01.txt"));
        Files.copy(sP,sP2, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Cкопировано из : "+sP+"\nВставлено в : "+sP2);

        Files.move(sP.resolve("test01.txt"),sP2.resolve("test01.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Перемещено из : "+sP+"" +
                "\nПеремещено в : "+sP2);
        Files.move(sP2.resolve("test01.txt"),sP2.resolve("test01renamed.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Переименовано из : "+sP2.resolve("test01.txt")+
                "\nПереименовано в : "+sP2.resolve("test01renamed.txt"));
        System.out.println("Копия успешна!!!");
    }
}
