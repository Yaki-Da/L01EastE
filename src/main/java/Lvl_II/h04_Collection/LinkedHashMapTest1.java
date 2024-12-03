package Lvl_II.h04_Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lHM =
                new LinkedHashMap<>(16,0.75f,true);
        //при false порядок в списке хранения элментов сохраняется
        //при true порядок тронутые элементы перезаписываются в конец коллекции
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Back", "Minotavr", 1);
        Student st3 = new Student("Klod", "Koshkoza", 2);
        Student st4 = new Student("Stev", "Varlonce", 1);
        Student st5 = new Student("Bard", "Perkolet", 4);
        Student st6 = new Student("Azur", "Puskalta", 3);
        Student st7 = new Student("Lopt", "Omletosh", 5);
        lHM.put(5.8, st1);
        lHM.put(9.1, st2);
        lHM.put(6.4, st3);
        lHM.put(7.5, st4);
        lHM.put(7.2, st5);
        lHM.put(8.2, st6);
        lHM.put(7.9, st7);
        System.out.println(lHM);
        System.out.println(lHM.get(5.8));
        System.out.println(lHM.get(9.1));
        System.out.println(lHM);
    }
}
