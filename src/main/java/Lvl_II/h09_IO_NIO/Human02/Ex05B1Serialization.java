package Lvl_II.h09_IO_NIO.Human02;

import Lvl_II.h09_IO_NIO.Human01.People;

import java.io.*;

public class Ex05B1Serialization {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\L01EastE\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        People people;
        try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(pathD+"\\Human01\\test03.b2"))){
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
