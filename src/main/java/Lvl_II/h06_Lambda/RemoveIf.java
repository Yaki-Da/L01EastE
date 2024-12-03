package Lvl_II.h06_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A7777777");
        al.add("B22");
        al.add("C666666");
        al.add("D333");
        al.add("E55555");
// Пример 1
//        al.removeIf(element -> element.length()<5);
// Пример 2
//        Predicate<String> pri = element -> element.length()<5;
//        al.removeIf(pri);

        System.out.println(al);
    }
}
