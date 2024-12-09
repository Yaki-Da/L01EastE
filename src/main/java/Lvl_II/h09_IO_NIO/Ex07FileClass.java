package Lvl_II.h09_IO_NIO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex07FileClass {

    public static String toString(File[] files) {
        if (files == null || files.length == 0) {
            return "Нет файлов в директории.";
        }
        StringBuilder sb = new StringBuilder();
        for (File file : files) {
            sb.append("[").append(file.getAbsolutePath()).append("]\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String pA = System.getProperty("user.dir");
        String pD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";

        File file = new File(pA+pD+"test05.txt");
        File folder = new File(pA+pD+"FolderTest");
        File fileTest = new File(pA+pD+"test04.txt");
        File folderTest = new File(pA+pD);
        folder.mkdir();
        file.createNewFile();
        folder.delete();
        file.delete();
        System.out.println("-------------------------------------------------");
        System.out.println("file.getAbsolutePath(): "+file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath(): "+folder.getAbsolutePath());
        System.out.println("-------------------------------------------------");
        System.out.println("file.isAbsoluteh(): "+file.isAbsolute());
        System.out.println("folder.isAbsolute(): "+folder.isAbsolute());
        System.out.println("-------------------------------------------------");
        System.out.println("file.isDirectory(): "+file.isDirectory());
        System.out.println("folder.isDirectory(): "+folder.isDirectory());
        System.out.println("-------------------------------------------------");
        System.out.println("file.exists(): "+file.exists());
        System.out.println("fileTest.exists(): "+fileTest.exists());
        System.out.println("folder.exists(): "+folder.exists());
        System.out.println("folderTest.exists(): "+folderTest.exists());
        System.out.println("-------------------------------------------------");
        System.out.println("fileTest.exists(): "+fileTest.length()+"byte");
        File[] files = folderTest.listFiles();
        System.out.println(toString(files));
//        System.out.println(Arrays.toString(files));

    }
}
