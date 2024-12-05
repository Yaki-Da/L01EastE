package Lvl_II.h09_IO_NIO.Human01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex05A1Serialization {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\LearningEastE_Tugulov\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        Automobile car = new Automobile("Mersedes-Benz","Black");
        People people = new People ("Эрнесто",28,225000.00,car);
        try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(pathD+"\\Human01\\test03.b2"))){
            oOS.writeObject(people);
            System.out.println("Серилизация произошла успешна!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
