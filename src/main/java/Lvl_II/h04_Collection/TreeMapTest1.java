package Lvl_II.h04_Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
        //1 вариант сортировка дерева
        TreeMap<Student, Double> treemap = new TreeMap<>();
        //2 вариант сортировки дерева
        TreeMap<Student, Double> treemap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Back", "Minotavr", 1);
        Student st3 = new Student("Klod", "Koshkoza", 2);
        Student st4 = new Student("Stev", "Varlonce", 1);
        Student st5 = new Student("Bard", "Perkolet", 4);
        Student st6 = new Student("Azur", "Puskalta", 3);
        Student st7 = new Student("Lopt", "Omletosh", 5);
        treemap.put(st1, 5.8);
        treemap.put(st2, 9.1);
        treemap.put(st3, 6.4);
        treemap.put(st4, 7.5);
        treemap.put(st5, 7.2);
        treemap.put(st6, 8.2);
        treemap.put(st7, 7.9);
        System.out.println(treemap);
//        System.out.println(treemap.get(6.4));
//        treemap.remove(9.1);
//        System.out.println(treemap);
//        System.out.println(treemap.descendingMap()); // вывод по убыванию
//        System.out.println(treemap.tailMap(7.5)); // вывод 7.5 по ключу и выше
//        System.out.println(treemap.headMap(7.5)); // вывод до ключа 7.5 и не равный ему
//        System.out.println(treemap.lastEntry());  // вывод конечного/высшего ключа
//        System.out.println(treemap.firstEntry()); // вывод начального/нисшего ключа
    }
}
