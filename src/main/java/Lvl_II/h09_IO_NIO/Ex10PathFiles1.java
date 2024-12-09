package Lvl_II.h09_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Ex10PathFiles1 {
    public static void main(String[] args) throws IOException {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";

        Path fP = Paths.get("test08.txt");
        Path dP = Paths.get(pA + pD);
        Path adP = Paths.get(pA + "\\p\\d\\c\\");

        System.out.println(".getFileName(): " + fP.getFileName());
        System.out.println(".getFileName(): " + dP.getFileName());
        System.out.println("-----------------------------------");
        System.out.println(".getParent(): " + fP.getParent());
        System.out.println(".getParent(): " + dP.getParent());
        System.out.println("-----------------------------------");
        System.out.println(".getRoot(): " + fP.getRoot());
        System.out.println(".getRoot(): " + dP.getRoot());
        System.out.println("-----------------------------------");
        System.out.println(".toAbsolutePath(): " + fP.toAbsolutePath());
        System.out.println(".toAbsolutePath(): " + dP.toAbsolutePath());
        System.out.println("-----------------------------------");
        System.out.println(".resolve(filePath): " + dP.resolve(fP));
        System.out.println(".relativize(anotherDirectoryPath): " + dP.relativize(adP));
        System.out.println("-----------------------------------");

        if (!Files.exists(Paths.get(pA+pD+fP.getFileName()))) {
            Files.createFile(Paths.get(pA+pD+fP.getFileName()));
        }
        if (!Files.exists(dP)) {
            Files.createDirectories(dP);
        }

        System.out.println("Files.isReadable(fP): "+Files.isReadable(fP));
        System.out.println("Files.isWritable(fP): "+Files.isWritable(fP));
        System.out.println("Files.isExecutable(fP): "+Files.isExecutable(fP));
        System.out.println("-----------------------------------");
        System.out.println(Files.size(Paths.get(pA+pD+"test06.txt"))+"byte");
        System.out.println("-----------------------------------");
        System.out.println(Files.getAttribute(Paths.get(pA+pD+"test06.txt"),"creationTime"));
        System.out.println("-----------------------------------");
        Map<String, Object> helpAtt = Files.readAttributes(Paths.get(pA+pD+"test06.txt"),"*");
        for(Map.Entry<String, Object> entry: helpAtt.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("-----------------------------------");
    }
}
