package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex14CopyFileTree {
    public static void main(String[] args) throws IOException {
        String pAD = System.getProperty("user.dir")+"\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        Path source = Paths.get(pAD+"X\\");
        Path destination = Paths.get(pAD+"Y\\");
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Копирование папки произошло успешно");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        if(!Files.exists(newDestination)) {
            Files.createDirectories(newDestination);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
