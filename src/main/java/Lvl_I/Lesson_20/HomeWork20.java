//Всё о классе ArrayList
package Lvl_I.Lesson_20;
import java.util.ArrayList;
import java.util.Collections;
public class HomeWork20 {
    public static ArrayList <String> abc(String...arr) {
        ArrayList <String> bort = new ArrayList<>();
        for (String o: arr) if (!bort.contains(o)) bort.add(o);
        Collections.sort(bort);
        return bort;
    }
    public static void main(String[] args) {
        System.out.println(abc("Булка","Веник","Соль","Моль","Веник"));
    }
}