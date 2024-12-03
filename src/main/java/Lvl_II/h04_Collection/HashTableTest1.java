package Lvl_II.h04_Collection;

import java.util.Hashtable;

public class HashTableTest1 {
    public static void main(String[] args) {
        //В отличии от HashMap синхронизированный и по этому более медленный
        //HshTable не имеет null
        //Для многопоточности лучше использовать ConcurrentHashMap
        Hashtable<Double, Student> ht = new Hashtable<Double, Student>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Back", "Minotavr", 1);
        Student st3 = new Student("Klod", "Koshkoza", 2);
        Student st4 = new Student("Stev", "Varlonce", 1);
        Student st5 = new Student("Bard", "Perkolet", 4);
        Student st6 = new Student("Azur", "Puskalta", 3);
        Student st7 = new Student("Lopt", "Omletosh", 5);
        ht.put(5.8, st1);
        ht.put(9.1, st2);
        ht.put(6.4, st3);
        ht.put(7.5, st4);
        ht.put(7.2, st5);
        ht.put(8.2, st6);
        ht.put(7.9, st7);
        System.out.println(ht);
    }
}
