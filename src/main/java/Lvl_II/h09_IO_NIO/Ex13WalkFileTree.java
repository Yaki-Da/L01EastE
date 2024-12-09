package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex13WalkFileTree {
    public static void main(String[] args) throws IOException {
        String pAD = System.getProperty("user.dir")+"\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        Path path = Paths.get(pAD+"X\\");
        Files.walkFileTree(path, new MyFileVisitor());

    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Enter from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}