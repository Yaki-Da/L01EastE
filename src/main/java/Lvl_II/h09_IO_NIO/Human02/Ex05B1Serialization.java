package Lvl_II.h09_IO_NIO.Human02;

import Lvl_II.h09_IO_NIO.Human01.People;

import java.io.*;

public class Ex05B1Serialization {
    public static void main(String[] args) {
        String pathA = System.getProperty("user.dir");
        String pathD = "\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        People people;
        try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(pathA+pathD+"\\Human01\\test03.b2"))){
            people = (People)oIS.readObject();
            System.out.println(people);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
