package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex15DeleteFileTree {
    public static void main(String[] args) throws IOException {
        String pAD = System.getProperty("user.dir")+"\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        Path path = Paths.get(pAD+"Y\\");
        if(Files.exists(path)) {
            Files.walkFileTree(path, new MyFileVisitor3());
            System.out.println("---Удаление произошло успешно---");
        }
        else System.out.println("---Удяляемая папка отсутствует---");
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Удаление директории/папки : "+dir.getFileName());
        if(Files.exists(dir)) {
            Files.delete(dir);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Удаление файлов : "+file.getFileName());
        if(Files.exists(file)) {
            Files.delete(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
