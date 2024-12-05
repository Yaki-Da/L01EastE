package Lvl_II.h09_IO_NIO.Human01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex05ASerilization {
    public static void main(String[] args) {
        String pathA = System.getProperty("user.dir");
        String pathD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        List<String> people = new ArrayList<>();
        people.add("Москва");
        people.add("Нью-Йорк");
        people.add("Токио");
        people.add("Омск");
        people.add("Барнаул");
        try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(pathA+pathD+"\\Human01\\test02.b2"))){
            oOS.writeObject(people);
            System.out.println("Серилизация произошла успешна!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
