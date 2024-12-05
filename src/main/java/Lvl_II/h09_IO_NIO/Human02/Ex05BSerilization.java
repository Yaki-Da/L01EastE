package Lvl_II.h09_IO_NIO.Human02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex05BSerilization {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\L01EastE\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        List<String> people;
        try (ObjectInputStream iOS = new ObjectInputStream(new FileInputStream(pathD+"\\Human01\\test02.b2"))){
            people = (ArrayList)iOS.readObject();
            System.out.println(people);
            System.out.println("Десерилизация произошла успешна!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}